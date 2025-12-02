using BackgroundStockChecker.Services;
using Microsoft.AspNetCore.Mvc;

namespace BackgroundStockChecker.Controllers
{
    public class HomeController : Controller
    {
        private readonly IStockCheckerService _stockService;

        public HomeController(IStockCheckerService stockService)
        {
            _stockService = stockService;
        }

        public IActionResult Index()
        {
            var products = _stockService.GetProducts();
            var lastCheck = _stockService.GetLastCheckTime();
            ViewData["Products"] = products;
            ViewData["LastCheckTime"] = lastCheck?.ToString("O") ?? "Never";

            // Updated task 3
            //var lastCheck = _stockChecker.LastCheckTime;

            //if (lastCheck != DateTime.MinValue)
            //{
            //    HttpContext.Session.SetString("LastCheckTime", lastCheck.ToString());
            //}

            // Put a one-time notification
            TempData["StatusMessage"] = "Stock check completed!";

            //var lastCheck = _stockChecker.LastCheckTime;

            if (lastCheck != DateTime.MinValue)
                HttpContext.Session.SetString("LastCheckTime", lastCheck.ToString());


            ////////// 


            return View();
        }

        public ActionResult Stock()
        {
            return View();
        }

        public ActionResult Log()
        {
            return View();
        }


        // JSON endpoint for polling from the client to get live updates
        [HttpGet]
        public IActionResult GetStatus()
        {
            var products = _stockService.GetProducts();
            var lastCheck = _stockService.GetLastCheckTime();
            return Json(new
            {
                lastCheckTimeUtc = lastCheck?.ToString("O"),
                products = products.Select(p => new { p.Id, p.Name, p.Stock })
            });
        }
    }
}
