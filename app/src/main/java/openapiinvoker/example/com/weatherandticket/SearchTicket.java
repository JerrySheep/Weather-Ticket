package openapiinvoker.example.com.weatherandticket;

import android.app.AlertDialog;
import android.app.DatePickerDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.support.annotation.IntegerRes;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.DatePicker;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.google.gson.Gson;
import com.lzy.okgo.OkGo;
import com.lzy.okgo.callback.StringCallback;
import com.zaaach.citypicker.CityPickerActivity;

import java.util.Calendar;

import okhttp3.Call;
import okhttp3.Response;

public class SearchTicket extends AppCompatActivity {
    Button searchBtn;
    TextView startStation;
    TextView arriveStation;
    TextView date;
    TextView timeChoice;
    ImageView stationChange;
    CheckBox[] checkBoxes = new CheckBox[4];


    DatePickerDialog.OnDateSetListener onDateSetListener;
    AlertDialog.Builder builder;

    int mYear;
    int mMonth;
    int mDay;

    private static final int REQUEST_CODE_PICK_CITY = 0;
    int clickCheck = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search_ticket);

        searchBtn = (Button)findViewById(R.id.search);
        startStation = (TextView)findViewById(R.id.start);
        arriveStation = (TextView)findViewById(R.id.arrive);
        date = (TextView)findViewById(R.id.time);
        timeChoice = (TextView)findViewById(R.id.time_choice);
        stationChange = (ImageView)findViewById(R.id.station_change);
        checkBoxes[0] = (CheckBox)findViewById(R.id.train_type_GD);
        checkBoxes[1] = (CheckBox)findViewById(R.id.train_type_Z);
        checkBoxes[2] = (CheckBox)findViewById(R.id.train_type_T);
        checkBoxes[3] = (CheckBox)findViewById(R.id.train_type_all);

        Calendar ca = Calendar.getInstance();
        mYear = ca.get(Calendar.YEAR);
        mMonth = ca.get(Calendar.MONTH);
        mDay = ca.get(Calendar.DAY_OF_MONTH);

        showCurrentDate();

        startStation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                clickCheck = 1;
                startActivityForResult(new Intent(SearchTicket.this, CityPickerActivity.class),
                        REQUEST_CODE_PICK_CITY);
            }
        });

        arriveStation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivityForResult(new Intent(SearchTicket.this, CityPickerActivity.class),
                        REQUEST_CODE_PICK_CITY);
            }
        });


        searchBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final String leaveCity = startStation.getText().toString();
                final String arriveCity = arriveStation.getText().toString();
                final String leaveDate = dataAnalysis(date.getText().toString());

                if(dateIdentify(leaveDate)) {
                    String url = "http://apis.juhe.cn/train/s2swithprice?start=" + leaveCity + "&end=" + arriveCity + "&date=" + leaveDate + "&key=" + "the key value you applied";
                    OkGo.get(url)
                            .execute(new StringCallback() {
                                @Override
                                public void onSuccess(String s, Call call, Response response) {
                                    //Toast.makeText(SearWeatherBeanchTicket.this,s,Toast.LENGTH_SHORT).show();
                                    TrainBean trainBean = new Gson().fromJson(s,TrainBean.class);
                                    //Toast.makeText(SearchTicket.this, trainBean.result.list.get(1).toString(), Toast.LENGTH_LONG).show();

                                    Intent intent = new Intent(SearchTicket.this, TicketShow.class);
                                    intent.putExtra("trainBean", trainLeaveTimeAnalysis(trainTypeAnalysis(trainBean), timeChoice.getText().toString()));
                                    intent.putExtra("leaveCity", leaveCity);
                                    intent.putExtra("arriveCity", arriveCity);
                                    startActivity(intent);
                                }

                                @Override
                                public void onError(Call call, Response response, Exception e) {
                                    Toast.makeText(SearchTicket.this, "网络异常，请查看网络连接后重试", Toast.LENGTH_LONG).show();
                                }
                            });
                }
                else{
                    Toast.makeText(SearchTicket.this, "无效的出发日期，请重新选择", Toast.LENGTH_LONG).show();
                }

            }
        });

        stationChange.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String temp = startStation.getText().toString();
                startStation.setText(arriveStation.getText().toString());
                arriveStation.setText(temp);
            }
        });

        checkBoxes[0].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                for(int i = 0; i < 4; i++){
                    if(i != 0){
                        checkBoxes[i].setChecked(false);
                    }
                }
            }
        });

        checkBoxes[1].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                for(int i = 0; i < 4; i++){
                    if(i != 1){
                        checkBoxes[i].setChecked(false);
                    }
                }
            }
        });

        checkBoxes[2].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                for(int i = 0; i < 4; i++){
                    if(i != 2){
                        checkBoxes[i].setChecked(false);
                    }
                }
            }
        });

        checkBoxes[3].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                for(int i = 0; i < 4; i++){
                    if(i != 3){
                        checkBoxes[i].setChecked(false);
                    }
                }
            }
        });
        //火车出发时间点击时间监控
        date.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                new DatePickerDialog(SearchTicket.this, onDateSetListener, mYear, mMonth, mDay).show();
            }
        });

        timeChoice.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showSingleChoiceDialog(view);
            }
        });

        //调用选择时间Dialog
        onDateSetListener = new DatePickerDialog.OnDateSetListener() {

            @Override
            public void onDateSet(DatePicker view, int year, int monthOfYear, int dayOfMonth) {
                mYear = year;
                mMonth = monthOfYear;
                mDay = dayOfMonth;
                String days;
                if (mMonth + 1 < 10) {
                    if (mDay < 10) {
                        days = new StringBuffer().append(mYear).append("年").append("0").
                                append(mMonth + 1).append("月").append("0").append(mDay).append("日").toString();
                    } else {
                        days = new StringBuffer().append(mYear).append("年").append("0").
                                append(mMonth + 1).append("月").append(mDay).append("日").toString();
                    }

                } else {
                    if (mDay < 10) {
                        days = new StringBuffer().append(mYear).append("年").
                                append(mMonth + 1).append("月").append("0").append(mDay).append("日").toString();
                    } else {
                        days = new StringBuffer().append(mYear).append("年").
                                append(mMonth + 1).append("月").append(mDay).append("日").toString();
                    }

                }
                date.setText(days);
            }
        };
    }

    //获取日期请求格式的字符串
    public String dataAnalysis(String leaveDate){
        String date = "";

        for(int i = 0; i < leaveDate.length(); i++){
            if(leaveDate.charAt(i) >= '0' && leaveDate.charAt(i) <= '9'){
                date += leaveDate.charAt(i);
            }
        }
        String year = "";
        String month = "";
        String day = "";
        for(int i = 0; i < date.length(); i++){
            if(i < 4){
                year += date.charAt(i);
            }
            else if(i < 6){
                month += date.charAt(i);
            }
            else {
                day += date.charAt(i);
            }
        }

        date = year + "-" + month + "-" + day;

        return date;
    }
    //重写onActivityResult方法
    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        if (requestCode == REQUEST_CODE_PICK_CITY && resultCode == RESULT_OK){
            if (data != null){
                String city = data.getStringExtra(CityPickerActivity.KEY_PICKED_CITY);
                if(clickCheck == 1){
                    startStation.setText(city);
                }
                else {
                    arriveStation.setText(city);
                }
                clickCheck = 0;
            }
        }
    }

    //显示当前时间并修正显示差异
    private void showCurrentDate() {
        if(mMonth < 9 && mDay < 10){
            date.setText(mYear + "年0" + (mMonth + 1) + "月0" + mDay + "日");
        }
        else if(mMonth < 9){
            date.setText(mYear + "年0" + (mMonth + 1) + "月" + mDay + "日");
        }
        else if(mDay < 10){
            date.setText(mYear + "年" + (mMonth + 1) + "月0" + mDay + "日");
        }
        else{
            date.setText(mYear + "年" + (mMonth + 1) + "月" + mDay + "日");
        }
    }

    //设置火车出发时间
    private void showSingleChoiceDialog(View view) {
        builder=new AlertDialog.Builder(this);
        builder.setIcon(R.drawable.time);
        builder.setTitle(" 选择出发时间");


        //设置内容区域为单选列表项
        final String[] items={"00：00 - 24：00   全天","00：00 - 06：00   凌晨","06：00 - 12：00   上午","12：00 - 18：00   下午","18：00 - 24：00   晚上"};
        builder.setSingleChoiceItems(items, 0, new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                Toast.makeText(getApplicationContext(), "已选择"+items[i], Toast.LENGTH_SHORT).show();
                timeChoice.setText(items[i]);
            }
        });

        builder.setCancelable(true);
        AlertDialog dialog=builder.create();
        dialog.show();
    }

    //筛选选中的座位类型
    public TrainBean trainTypeAnalysis(TrainBean trainBean){

        if(checkBoxes[3].isChecked()){
            return trainBean;
        }
        for(int i = 0; i < trainBean.result.list.size(); i++){
            if(checkBoxes[0].isChecked()){
                if((!trainBean.result.list.get(i).getTrain_type().equals("G")) && (!trainBean.result.list.get(i).getTrain_type().equals("D"))) {
                    trainBean.result.list.remove(trainBean.result.list.get(i));
                    i--;
                }

                continue;
            }
            else if(checkBoxes[1].isChecked()){
                if((!trainBean.result.list.get(i).getTrain_type().equals("Z"))){
                    trainBean.result.list.remove(trainBean.result.list.get(i));
                    i--;
                }

                continue;
            }
            else if(checkBoxes[2].isChecked()){
                if((!trainBean.result.list.get(i).getTrain_type().equals("T"))){
                    trainBean.result.list.remove(trainBean.result.list.get(i));
                    i--;
                }

                continue;
            }
        }

        return trainBean;
    }

    //筛选选中的出发时间段
    public TrainBean trainLeaveTimeAnalysis(TrainBean trainBean, String leaveTime){
        if(leaveTime.equals("00：00 - 24：00   全天"))
            return trainBean;

        int leaveMinClock = (leaveTime.charAt(0) - '0') * 10 + (leaveTime.charAt(1) - '0');
        int leaveMaxClock = leaveMinClock + 6;

        for(int i = 0; i < trainBean.result.list.size(); i++){
            int startClock = (trainBean.result.list.get(i).getStart_time().charAt(0) - '0') * 10 + (trainBean.result.list.get(i).getStart_time().charAt(1) - '0');
            if(startClock < leaveMinClock || startClock >= leaveMaxClock){
                trainBean.result.list.remove(trainBean.result.list.get(i));
                i--;
            }
        }

        return trainBean;
    }

    //判断当前时间和出发时间冲突
    public boolean dateIdentify(String leaveDate){
        String dateWithoutSymbol = "";

        for(int i = 0; i < leaveDate.length(); i++){
            if(leaveDate.charAt(i) >= '0' && leaveDate.charAt(i) <= '9'){
                dateWithoutSymbol += leaveDate.charAt(i);
            }
        }
        String leaveYear = "";
        String leaveMonth = "";
        String leaveDay = "";

        for(int i = 0; i < dateWithoutSymbol.length(); i++){
            if(i < 4){
                leaveYear += dateWithoutSymbol.charAt(i);
            }
            else if(i < 6){
                leaveMonth += dateWithoutSymbol.charAt(i);
            }
            else {
                leaveDay += dateWithoutSymbol.charAt(i);
            }
        }

        int year = Integer.parseInt(leaveYear);
        int month = Integer.parseInt(leaveMonth);
        int day = Integer.parseInt(leaveDay);

        Calendar ca = Calendar.getInstance();
        mYear = ca.get(Calendar.YEAR);
        mMonth = ca.get(Calendar.MONTH);
        mDay = ca.get(Calendar.DAY_OF_MONTH);

        if(year < mYear){
            return false;
        }
        else if(year == mYear && month < mMonth + 1){
            return false;
        }
        else if(year == mYear && month == mMonth + 1 && day < mDay)
            return false;

        return true;
    }
}
