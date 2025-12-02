using BackgroundStockChecker.Services;

namespace BackgroundStockChecker.Models
{
    public class Product
    {
        public int Id { get; set; }
        public string Name { get; set; } = "";
        public int Stock { get; set; }
        //public LowStockAlert? OnLowStock { get; set; }
    }

       
    }


