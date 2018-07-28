package level13.lesson11.home02;

/* Погода
1. В классе Today реализовать интерфейс Weather.
2. Подумай, как связан параметр String type с методом getWeatherType().
3. Интерфейсы Weather и WeatherType уже реализованы.
*/


public class Solution {
    public static void main(String[] args) {
        System.out.println(new Today(WeatherType.CLOUDY));
        System.out.println(new Today(WeatherType.FOGGY));
        System.out.println(new Today(WeatherType.FROZEN));
    }

    static class Today implements Weather {
        String weather;

        @Override
        public String getWeatherType() {
            return weather;
        }

        Today(String weather) {
            this.weather = weather;
        }

        @Override
        public String toString() {
            return String.format("%s for today", this.getWeatherType());
        }
    }
}