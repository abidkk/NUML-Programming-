
using BackgroundStockChecker.Models;

namespace BackgroundStockChecker.Services
{
    // Delegate signature: takes a Product that is low on stock
    public delegate void LowStockAlert(Product product);
}


//using BackgroundStockChecker.Models;

//namespace BackgroundStockChecker.Services
//{
//    public class StockAlertDelegate
//    {
//    }
//}