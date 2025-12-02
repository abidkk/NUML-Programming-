using BackgroundStockChecker.Models;
using System.Diagnostics;

namespace BackgroundStockChecker.Services
{
    // Runs in background + allows controller to read products
    public class StockCheckerService : IStockCheckerService, IHostedService, IDisposable
    {
        private readonly object _sync = new();
        private readonly List<Product> _products = new();
        private CancellationTokenSource? _cts;
        private Task? _backgroundTask;
        private DateTime? _lastCheckTime;
        private readonly Random _rng = new();

        // === Task 2.2 Delegate ===
        public LowStockAlert? OnLowStock { get; set; }

        // === Task 2.3 Session usage (controller reads this) ===
        public DateTime LastCheckTime => _lastCheckTime ?? DateTime.MinValue;

        // === Task 2.4 Logging Switches ===
        private static readonly BooleanSwitch GeneralLoggingSwitch =
            new BooleanSwitch("GeneralLogging", "Enable or disable general debug logs");

        private static readonly TraceSwitch StockTraceSwitch =
            new TraceSwitch("StockTrace", "Trace stock checking process");

        // Time between checks
        private readonly TimeSpan _delayBetweenChecks = TimeSpan.FromSeconds(5);

        public StockCheckerService()
        {
            // Seed data
            _products.Add(new Product { Id = 1, Name = "Apple", Stock = 10 });
            _products.Add(new Product { Id = 2, Name = "Banana", Stock = 15 });
            _products.Add(new Product { Id = 3, Name = "Orange", Stock = 1 });
        }

        // Returns safe copy
        public IReadOnlyList<Product> GetProducts()
        {
            lock (_sync)
            {
                return _products
                    .Select(p => new Product { Id = p.Id, Name = p.Name, Stock = p.Stock })
                    .ToList();
            }
        }

        public DateTime? GetLastCheckTime()
        {
            lock (_sync) { return _lastCheckTime; }
        }

        // Start hosted service
        public Task StartAsync(CancellationToken cancellationToken)
        {
            _cts = CancellationTokenSource.CreateLinkedTokenSource(cancellationToken);
            _backgroundTask = Task.Run(() => BackgroundLoopAsync(_cts.Token));
            return Task.CompletedTask;
        }

        // Stop hosted service
        public async Task StopAsync(CancellationToken cancellationToken)
        {
            if (_cts != null)
            {
                _cts.Cancel();
                try
                {
                    if (_backgroundTask != null)
                        await Task.WhenAny(_backgroundTask, Task.Delay(Timeout.Infinite, cancellationToken));
                }
                catch (OperationCanceledException) { }
            }
        }

        // Background loop
        private async Task BackgroundLoopAsync(CancellationToken cancellationToken)
        {
            Trace.WriteLine("[THREAD] Background stock checker started.");

            while (!cancellationToken.IsCancellationRequested)
            {
                DoStockCheck();

                try
                {
                    await Task.Delay(_delayBetweenChecks, cancellationToken);
                }
                catch (TaskCanceledException)
                {
                    break;
                }
            }

            Trace.WriteLine("[THREAD] Background stock checker stopped.");
        }

        // === MAIN STOCK CHECK LOGIC ===
        private void DoStockCheck()
        {
            Trace.WriteLine($"[THREAD] Stock check started at {DateTime.Now}");

            if (GeneralLoggingSwitch.Enabled)
                Debug.WriteLine("Background stock check started.");

            Trace.WriteLineIf(StockTraceSwitch.TraceInfo, "Performing stock check...");

            List<Product> lowStockItems = new();

            lock (_sync)
            {
                foreach (var product in _products)
                {
                    int decrease = _rng.Next(1, 5);
                    product.Stock -= decrease;

                    // General debugging
                    Debug.WriteLineIf(GeneralLoggingSwitch.Enabled,
                        $"[STATE] {product.Name} decreased by {decrease}, new stock: {product.Stock}");

                    // Verbose tracing
                    Trace.WriteLineIf(StockTraceSwitch.TraceVerbose,
                        $"[VERBOSE] {product.Name}: stock now {product.Stock}");

                    // Low-stock alert
                    if (product.Stock < 5)
                    {
                        Trace.WriteLineIf(StockTraceSwitch.TraceWarning,
                            $"[ALERT] LOW STOCK → {product.Name} ({product.Stock})");

                        Debug.WriteLine($"LOW STOCK → {product.Name}: {product.Stock}");

                        lowStockItems.Add(product);
                    }
                }

                // Update timestamp
                _lastCheckTime = DateTime.Now;
                Trace.WriteLine($"[STATE] LastCheckTime updated to {_lastCheckTime}");
            }

            // Fire delegate outside locked region
            foreach (var item in lowStockItems)
                OnLowStock?.Invoke(item);

            Trace.WriteLineIf(StockTraceSwitch.TraceInfo,
                $"Stock check finished at {_lastCheckTime}");

            if (GeneralLoggingSwitch.Enabled)
                Debug.WriteLine("Background stock check completed.");

            Trace.WriteLine($"[THREAD] Stock check ended at {DateTime.Now}");
        }

        public void RunManualStockCheck()
        {
            DoStockCheck();
        }


        public void Dispose() => _cts?.Dispose();
    }
}
