using Microsoft.AspNetCore.Mvc;
using MyFirstWebApplication.Models;

namespace MyFirstWebApplication.Controllers
{
    

    [Route("api/[controller]")]
    [ApiController]
    public class WeatherForecaseController : ControllerBase
    {

        private WeatherForecaseController _weatherForecaseController;

        public WeatherForecaseController(WeatherForecaseController weatherForecaseController)
        {
            _weatherForecaseController = weatherForecaseController;
        }

        [HttpPost("add-data")]
        public ActionResult<bool> Add([FromQuery]DateTime date, [FromQuery] int temperatureC)
        {
            bool result = _weatherForecaseController.Add(date, temperatureC);
            return Ok(result);
        }

        [HttpPut("update-data")]
        public ActionResult<bool> Update([FromQuery] DateTime date, [FromQuery] int temperatureC)
        {
            bool result = _weatherForecaseController.Update(date, temperatureC);
            return Ok(result);
        }
        [HttpDelete("delete-data")]
        public ActionResult<List<WeatherForecast>> Delete([FromQuery] DateTime date)
        {
            List<WeatherForecast> weatherForecasts = _weatherForecaseController.Get(date, date);
            foreach (WeatherForecast weatherForecast in weatherForecasts)
            {
                _weatherForecaseController.Delete(weatherForecast);
            }
            return Ok();
        }

        [HttpGet("get-data")]
        public ActionResult<List<WeatherForecast>> Get([FromQuery] DateTime from, [FromQuery] DateTime to)
        {
            List<WeatherForecast> result = _weatherForecaseController.Get(from, to);
            return Ok(result);
        }
    }
}
