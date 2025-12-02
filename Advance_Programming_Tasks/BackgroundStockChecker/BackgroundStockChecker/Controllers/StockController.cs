using BackgroundStockChecker.Services;
using Microsoft.AspNetCore.Mvc;
using System.Diagnostics;

namespace BackgroundStockChecker.Controllers
{
    public class StockController : Controller
    {
        private readonly StockCheckerService _service;

        public StockController(StockCheckerService service)
        {
            _service = service;
        }

        public IActionResult Index()
        {
            var products = _service.GetProducts();
            return View(products);
        }

        // Manual stock check
        public IActionResult ManualCheck()
        {
            _service.RunManualStockCheck();

            TempData["Message"] = "Manual stock check completed!";
            HttpContext.Session.SetString("LastCheckTime", DateTime.Now.ToString());

            Trace.WriteLine("[MANUAL] Manual stock check executed.");

            return RedirectToAction("Index");
        }
    }
}
