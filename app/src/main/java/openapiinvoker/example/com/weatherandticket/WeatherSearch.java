package openapiinvoker.example.com.weatherandticket;

/**
 * Created by yanhao on 2018/3/20.
 */

public class WeatherSearch {
    public static WeatherBean weatherBean;

    public WeatherBean getWeatherBean() {
        return weatherBean;
    }

    public void setWeatherBean(WeatherBean weatherBean) {
        this.weatherBean = weatherBean;
    }

    //返回查询城市名称（成都、重庆...）
    public static String getCityName(){
        return weatherBean.result.today.getCity();
    }

    //返回查询城市的当前温度（24、25、26...）
    public static String getTodayCurrentTemp(){
        return weatherBean.result.sk.getTemp();
    }

    //返回查询城市的当前风向情况（持续无风向微风...）
    public static String getTodayWind(){
        return weatherBean.result.today.getWind();
    }

    //返回查询城市今天的天气状况（晴、阴、多云...）
    public  static String getTodayCondition(){
        return weatherBean.result.today.getWeather();
    }

    //返回查询城市今天的温度范围（11℃~17℃、22℃~32℃...）
    public static String getTodayTempScope(){
        return weatherBean.result.today.getTemperature();
    }

    //返回查询城市明天的天气状况（晴、阴、多云...）
    public static String getTomorrowCondition(){
        return weatherBean.result.future.get(0).getWeather();
    }

    //返回查询城市明天的温度范围（11℃~17℃、22℃~32℃...）
    public static String getTomorrowTempScope(){
        return weatherBean.result.future.get(0).getTemperature();
    }

    //返回查询城市后天的天气状况（晴、阴、多云...）
    public static String getTheDayAfterTomorrowCondition(){
        return weatherBean.result.future.get(1).getWeather();
    }

    //返回查询城市后天的温度范围（11℃~17℃、22℃~32℃...）
    public static String getTheDayAfterTomorrowTempScope(){
        return weatherBean.result.future.get(1).getTemperature();
    }
}
