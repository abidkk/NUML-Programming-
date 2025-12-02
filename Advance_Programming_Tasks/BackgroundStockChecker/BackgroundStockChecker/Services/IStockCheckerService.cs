using BackgroundStockChecker.Models;

namespace BackgroundStockChecker.Services
{
    public interface IStockCheckerService
    {
        IReadOnlyList<Product> GetProducts();    // thread-safe snapshot of current products
        DateTime? GetLastCheckTime();            // last time the background checker ran
    }
}
