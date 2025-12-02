using Microsoft.AspNetCore.Mvc;

namespace BackgroundStockChecker.Controllers
{
    public class LogsController : Controller
    {
        public IActionResult Index()
        {
            string logPath = Path.Combine(AppContext.BaseDirectory, "trace-log.txt");

            string logs = System.IO.File.Exists(logPath)
                ? System.IO.File.ReadAllText(logPath)
                : "No logs found.";

            ViewBag.Logs = logs;

            return View();
        }
    }
}
