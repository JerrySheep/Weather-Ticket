package openapiinvoker.example.com.weatherandticket;

import java.io.Serializable;
import java.util.List;

/**
 * Created by yanhao on 2018/3/20.
 */

public class WeatherBean implements Serializable {

    public ResultBean getResult() {
        return result;
    }

    public void setResult(ResultBean result) {
        this.result = result;
    }

    /**
     * resultcode : 200
     * reason : successed!
     * result : {"sk":{"temp":"17","wind_direction":"西风","wind_strength":"2级","humidity":"63%","time":"15:29"},"today":{"temperature":"11℃~17℃","weather":"阴转小雨","weather_id":{"fa":"02","fb":"07"},"wind":"持续无风向微风","week":"星期二","city":"成都","date_y":"2018年03月20日","dressing_index":"较冷","dressing_advice":"建议着厚外套加毛衣等服装。年老体弱者宜着大衣、呢外套加羊毛衫。","uv_index":"最弱","comfort_index":"","wash_index":"不宜","travel_index":"较适宜","exercise_index":"较适宜","drying_index":""},"future":[{"temperature":"11℃~17℃","weather":"阴转小雨","weather_id":{"fa":"02","fb":"07"},"wind":"持续无风向微风","week":"星期二","date":"20180320"},{"temperature":"11℃~17℃","weather":"阴","weather_id":{"fa":"02","fb":"02"},"wind":"持续无风向微风","week":"星期三","date":"20180321"},{"temperature":"12℃~21℃","weather":"多云转小雨","weather_id":{"fa":"01","fb":"07"},"wind":"持续无风向微风","week":"星期四","date":"20180322"},{"temperature":"13℃~18℃","weather":"阴转小雨","weather_id":{"fa":"02","fb":"07"},"wind":"持续无风向微风","week":"星期五","date":"20180323"},{"temperature":"12℃~19℃","weather":"阴转多云","weather_id":{"fa":"02","fb":"01"},"wind":"持续无风向微风","week":"星期六","date":"20180324"},{"temperature":"12℃~21℃","weather":"多云转小雨","weather_id":{"fa":"01","fb":"07"},"wind":"持续无风向微风","week":"星期日","date":"20180325"},{"temperature":"12℃~21℃","weather":"多云转小雨","weather_id":{"fa":"01","fb":"07"},"wind":"持续无风向微风","week":"星期一","date":"20180326"}]}
     * error_code : 0
     */

    public String resultcode;
    public String reason;
    public ResultBean result;
    public int error_code;

    public static class ResultBean implements Serializable {
        /**
         * sk : {"temp":"17","wind_direction":"西风","wind_strength":"2级","humidity":"63%","time":"15:29"}
         * today : {"temperature":"11℃~17℃","weather":"阴转小雨","weather_id":{"fa":"02","fb":"07"},"wind":"持续无风向微风","week":"星期二","city":"成都","date_y":"2018年03月20日","dressing_index":"较冷","dressing_advice":"建议着厚外套加毛衣等服装。年老体弱者宜着大衣、呢外套加羊毛衫。","uv_index":"最弱","comfort_index":"","wash_index":"不宜","travel_index":"较适宜","exercise_index":"较适宜","drying_index":""}
         * future : [{"temperature":"11℃~17℃","weather":"阴转小雨","weather_id":{"fa":"02","fb":"07"},"wind":"持续无风向微风","week":"星期二","date":"20180320"},{"temperature":"11℃~17℃","weather":"阴","weather_id":{"fa":"02","fb":"02"},"wind":"持续无风向微风","week":"星期三","date":"20180321"},{"temperature":"12℃~21℃","weather":"多云转小雨","weather_id":{"fa":"01","fb":"07"},"wind":"持续无风向微风","week":"星期四","date":"20180322"},{"temperature":"13℃~18℃","weather":"阴转小雨","weather_id":{"fa":"02","fb":"07"},"wind":"持续无风向微风","week":"星期五","date":"20180323"},{"temperature":"12℃~19℃","weather":"阴转多云","weather_id":{"fa":"02","fb":"01"},"wind":"持续无风向微风","week":"星期六","date":"20180324"},{"temperature":"12℃~21℃","weather":"多云转小雨","weather_id":{"fa":"01","fb":"07"},"wind":"持续无风向微风","week":"星期日","date":"20180325"},{"temperature":"12℃~21℃","weather":"多云转小雨","weather_id":{"fa":"01","fb":"07"},"wind":"持续无风向微风","week":"星期一","date":"20180326"}]
         */

        public SkBean sk;
        public TodayBean today;
        public List<FutureBean> future;

        public SkBean getSk() {
            return sk;
        }

        public void setSk(SkBean sk) {
            this.sk = sk;
        }

        public TodayBean getToday() {
            return today;
        }

        public void setToday(TodayBean today) {
            this.today = today;
        }

        public List<FutureBean> getFuture() {
            return future;
        }

        public void setFuture(List<FutureBean> future) {
            this.future = future;
        }

        public static class SkBean implements Serializable {
            /**
             * temp : 17
             * wind_direction : 西风
             * wind_strength : 2级
             * humidity : 63%
             * time : 15:29
             */

            public String temp;
            public String wind_direction;
            public String wind_strength;
            public String humidity;
            public String time;

            public String getTemp() {
                return temp;
            }

            public void setTemp(String temp) {
                this.temp = temp;
            }

            public String getWind_direction() {
                return wind_direction;
            }

            public void setWind_direction(String wind_direction) {
                this.wind_direction = wind_direction;
            }

            public String getWind_strength() {
                return wind_strength;
            }

            public void setWind_strength(String wind_strength) {
                this.wind_strength = wind_strength;
            }

            public String getHumidity() {
                return humidity;
            }

            public void setHumidity(String humidity) {
                this.humidity = humidity;
            }

            public String getTime() {
                return time;
            }

            public void setTime(String time) {
                this.time = time;
            }
        }

        public static class TodayBean implements Serializable {
            /**
             * temperature : 11℃~17℃
             * weather : 阴转小雨
             * weather_id : {"fa":"02","fb":"07"}
             * wind : 持续无风向微风
             * week : 星期二
             * city : 成都
             * date_y : 2018年03月20日
             * dressing_index : 较冷
             * dressing_advice : 建议着厚外套加毛衣等服装。年老体弱者宜着大衣、呢外套加羊毛衫。
             * uv_index : 最弱
             * comfort_index :
             * wash_index : 不宜
             * travel_index : 较适宜
             * exercise_index : 较适宜
             * drying_index :
             */

            public String temperature;
            public String weather;
            public WeatherIdBean weather_id;
            public String wind;
            public String week;
            public String city;
            public String date_y;
            public String dressing_index;
            public String dressing_advice;
            public String uv_index;
            public String comfort_index;
            public String wash_index;
            public String travel_index;
            public String exercise_index;
            public String drying_index;

            public String getTemperature() {
                return temperature;
            }

            public void setTemperature(String temperature) {
                this.temperature = temperature;
            }

            public String getWeather() {
                return weather;
            }

            public void setWeather(String weather) {
                this.weather = weather;
            }

            public WeatherIdBean getWeather_id() {
                return weather_id;
            }

            public void setWeather_id(WeatherIdBean weather_id) {
                this.weather_id = weather_id;
            }

            public String getWind() {
                return wind;
            }

            public void setWind(String wind) {
                this.wind = wind;
            }

            public String getWeek() {
                return week;
            }

            public void setWeek(String week) {
                this.week = week;
            }

            public String getCity() {
                return city;
            }

            public void setCity(String city) {
                this.city = city;
            }

            public String getDate_y() {
                return date_y;
            }

            public void setDate_y(String date_y) {
                this.date_y = date_y;
            }

            public String getDressing_index() {
                return dressing_index;
            }

            public void setDressing_index(String dressing_index) {
                this.dressing_index = dressing_index;
            }

            public String getDressing_advice() {
                return dressing_advice;
            }

            public void setDressing_advice(String dressing_advice) {
                this.dressing_advice = dressing_advice;
            }

            public String getUv_index() {
                return uv_index;
            }

            public void setUv_index(String uv_index) {
                this.uv_index = uv_index;
            }

            public String getComfort_index() {
                return comfort_index;
            }

            public void setComfort_index(String comfort_index) {
                this.comfort_index = comfort_index;
            }

            public String getWash_index() {
                return wash_index;
            }

            public void setWash_index(String wash_index) {
                this.wash_index = wash_index;
            }

            public String getTravel_index() {
                return travel_index;
            }

            public void setTravel_index(String travel_index) {
                this.travel_index = travel_index;
            }

            public String getExercise_index() {
                return exercise_index;
            }

            public void setExercise_index(String exercise_index) {
                this.exercise_index = exercise_index;
            }

            public String getDrying_index() {
                return drying_index;
            }

            public void setDrying_index(String drying_index) {
                this.drying_index = drying_index;
            }

            public static class WeatherIdBean implements Serializable {
                /**
                 * fa : 02
                 * fb : 07
                 */

                public String fa;
                public String fb;

                public String getFa() {
                    return fa;
                }

                public void setFa(String fa) {
                    this.fa = fa;
                }

                public String getFb() {
                    return fb;
                }

                public void setFb(String fb) {
                    this.fb = fb;
                }
            }
        }

        public static class FutureBean implements Serializable {
            /**
             * temperature : 11℃~17℃
             * weather : 阴转小雨
             * weather_id : {"fa":"02","fb":"07"}
             * wind : 持续无风向微风
             * week : 星期二
             * date : 20180320
             */

            public String temperature;
            public String weather;
            public WeatherIdBeanX weather_id;
            public String wind;
            public String week;
            public String date;

            public String getTemperature() {
                return temperature;
            }

            public void setTemperature(String temperature) {
                this.temperature = temperature;
            }

            public String getWeather() {
                return weather;
            }

            public void setWeather(String weather) {
                this.weather = weather;
            }

            public WeatherIdBeanX getWeather_id() {
                return weather_id;
            }

            public void setWeather_id(WeatherIdBeanX weather_id) {
                this.weather_id = weather_id;
            }

            public String getWind() {
                return wind;
            }

            public void setWind(String wind) {
                this.wind = wind;
            }

            public String getWeek() {
                return week;
            }

            public void setWeek(String week) {
                this.week = week;
            }

            public String getDate() {
                return date;
            }

            public void setDate(String date) {
                this.date = date;
            }

            public static class WeatherIdBeanX implements Serializable {
                /**
                 * fa : 02
                 * fb : 07
                 */

                public String fa;
                public String fb;

                public String getFa() {
                    return fa;
                }

                public void setFa(String fa) {
                    this.fa = fa;
                }

                public String getFb() {
                    return fb;
                }

                public void setFb(String fb) {
                    this.fb = fb;
                }
            }
        }
    }
}
