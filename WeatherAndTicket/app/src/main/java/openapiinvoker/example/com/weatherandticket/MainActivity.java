package openapiinvoker.example.com.weatherandticket;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.google.gson.Gson;
import com.lzy.okgo.OkGo;
import com.lzy.okgo.callback.StringCallback;

import okhttp3.Call;
import okhttp3.Response;

public class MainActivity extends AppCompatActivity {
    Button tickerButton;
    Button weatherButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tickerButton = (Button)findViewById(R.id.ticket);
        weatherButton = (Button)findViewById(R.id.weather);

        tickerButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, SearchTicket.class);

                startActivity(intent);
            }
        });

        weatherButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //注意修改cityName为你获取的城市名称
                String cityName = "成都";
                String weatherUrl = "http://v.juhe.cn/weather/index?cityname=" + cityName + "&format=2&key=" + "the key value you applied";
                OkGo.get(weatherUrl)
                        .execute(new StringCallback() {
                            @Override
                            public void onSuccess(String s, Call call, Response response) {
                                WeatherBean weatherBean = new Gson().fromJson(s,WeatherBean.class);

                                WeatherSearch weatherSearch = new WeatherSearch();

                                //已将查询到的weatherBean放入类中，你只需要查询数据即可
                                weatherSearch.setWeatherBean(weatherBean);

                                /*

                                在这里进行数据的查询以及插入，查询类是WeatherSearch
                                 */
                            }

                            @Override
                            public void onError(Call call, Response response, Exception e) {
                        /*
                        !!!!!!!!!!!!!!!!!
                        下方语句中的Toast的第一个参数.this前面加入本Activity名称
                        !!!!!!!!!!!!!!!!!
                         */
                                Toast.makeText(MainActivity.this, "网络异常，请查看网络连接后重试", Toast.LENGTH_LONG).show();
                            }
                        });
            }
        });



    }
}
