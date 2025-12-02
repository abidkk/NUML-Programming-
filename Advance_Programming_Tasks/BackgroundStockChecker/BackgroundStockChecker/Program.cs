//using BackgroundStockChecker.Logging;   // <-- Make sure this matches your folder namespace
using BackgroundStockChecker.Services;
using System.Diagnostics;
using YourProjectNamespace.Logging;

var builder = WebApplication.CreateBuilder(args);

// MVC + Session
builder.Services.AddControllersWithViews();
builder.Services.AddSession();

// Register background + DI service (single shared instance)
builder.Services.AddSingleton<StockCheckerService>();
builder.Services.AddSingleton<IStockCheckerService>(sp => sp.GetRequiredService<StockCheckerService>());
builder.Services.AddHostedService(sp => sp.GetRequiredService<StockCheckerService>());

var app = builder.Build();


// 
//  adD TRACE , DEBUG LISTENERS  (TASK 2.4 & 2.5)


// Path for log file
var logFilePath = Path.Combine(AppContext.BaseDirectory, "trace-log.txt");

// Add custom file listener (Task 2.5)
Trace.Listeners.Add(new FileTraceListener(logFilePath));

// Add console listener for debugging visibility
Trace.Listeners.Add(new TextWriterTraceListener(Console.Out));

// IMPORTANT ? Debug.Listeners **does not** allow adding new listeners in .NET 8
// So you CANNOT use: Debug.Listeners.Add(...)
// Instead, use Trace for all logging. Debug.WriteLine still prints to Visual Studio output.

// Enable auto-flush for logging
Trace.AutoFlush = true;


// 
//  session , delegate SETUP (TASK 2.2 & 2.3)

app.UseSession();

// low stock alert delegate
var stockService = app.Services.GetRequiredService<StockCheckerService>();
stockService.OnLowStock = product =>
{
    Trace.WriteLine($"[ALERT] Low stock: {product.Name} ? {product.Stock}");
    Console.WriteLine($"[ALERT] Low stock: {product.Name} ? {product.Stock}");
};


//
//  Middleware
// 

if (!app.Environment.IsDevelopment())
{
    app.UseExceptionHandler("/Home/Error");
    app.UseHsts();
}

app.UseHttpsRedirection();
app.UseStaticFiles();

app.UseRouting();
app.UseAuthorization();

app.MapControllerRoute(
    name: "default",
    pattern: "{controller=Home}/{action=Index}/{id?}"
);

app.Run();
