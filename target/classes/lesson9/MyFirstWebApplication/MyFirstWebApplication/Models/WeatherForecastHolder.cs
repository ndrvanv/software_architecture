using System.Data;

namespace MyFirstWebApplication.Models
{
    /// <summary>
    /// Объект на базе класса WeatherForecastHolder будет хранить список показаний по температуре
    /// </summary>
    public class WeatherForecastHolder
    {
        //private static WeatherForecastHolder _instance;
        //public static WeatherForecastHolder Instance()
        //{
        //    if (_instance == null)
        //        _instance = new WeatherForecastHolder();
        //    return _instance;
        //}



        // Коллекция для хранения по температуре
        private List<WeatherForecast> _values;

       public WeatherForecastHolder()
        {
            _values = new List<WeatherForecast>();
        }

        /// <summary>
        /// Добавить новый показатель по температуре
        /// </summary>
        /// <param name="date"></param>
        /// <param name="temperature"></param>
        public bool Add(DateTime date, int temperatureС)
        {
            WeatherForecast forecast = new WeatherForecast();
            forecast.TemperatureC = temperatureС;
            forecast.Date = date;
            _values.Add(forecast);
            return true;
        }

        /// <summary>
        /// Обновить показатели по температуре
        /// </summary>
        /// <param name="date"></param>
        /// <param name="temperatureС"></param>
        /// <returns></returns>
        public bool Update(DateTime date, int temperatureС)
        {
            foreach (WeatherForecast forecast in _values)
            {
                if (forecast.Date == date)
                {
                    forecast.TemperatureC = temperatureС;
                    return true;
                }
            }
            return false;

        }

        /// <summary>
        /// Удалить показания по температуре за указанную дату
        /// </summary>
        /// <param name="date"></param>
        /// <returns></returns>
        public bool Delete(DateTime date)
        {
            // Находим все показания по температуре для указанной даты
            List<WeatherForecast> forecasts = Get(date, date);

            // Удаляем все найденные показания
            foreach (WeatherForecast forecast in forecasts)
            {
                _values.Remove(forecast);
            }

            return forecasts.Count > 0;
        }

        /// <summary>
        /// Получить показатели температуры за период
        /// </summary>
        /// <param name="from"></param>
        /// <param name="to"></param>
        /// <returns></returns>
        public List<WeatherForecast> Get(DateTime from, DateTime to)
        {
            List<WeatherForecast> resultList = new List<WeatherForecast>();
            foreach (WeatherForecast forecast in _values)
            {
                if (forecast.Date >= from && forecast.Date <= to)
                {
                    resultList.Add(forecast);
                }
            }
            return resultList;
        }
    }
    
}
