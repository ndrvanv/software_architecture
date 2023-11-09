namespace MyFirstWebApplication.Models
{
    /// <summary>
    /// Прогноз погоды
    /// </summary>
    public class WeatherForecast
    {
        /// <summary>
        /// Дата измерения
        /// </summary>
        public DateTime Date { get; set; }

        /// <summary>
        /// Температура градус цельсия
        /// </summary>
        public int TemperatureC { get; set; }

        /// <summary>
        /// Температура градус франгейта
        /// </summary>
        public int TemperatureF
        {
            get { return 32 + (int)(TemperatureC / 0.5556); }
        }
    }
}
