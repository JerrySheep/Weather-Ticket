package openapiinvoker.example.com.weatherandticket;

import android.speech.tts.TextToSpeech;
import android.widget.TextView;

import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;

import java.util.List;

/**
 * Created by yanhao on 2018/3/8.
 */

public class BrvahAdapter extends BaseQuickAdapter<TrainBean.ResultBean.ListBean, BaseViewHolder> {
    public BrvahAdapter(int layoutResId, List data){
        super(layoutResId, data);
    }

    @Override
    protected void convert(BaseViewHolder helper, TrainBean.ResultBean.ListBean item) {
        helper.setText(R.id.leave_time, item.start_time)
                .setText(R.id.start_staion, item.start_station)
                .setText(R.id.arrive_time, item.end_time)
                .setText(R.id.end_station, item.end_station)
                .setText(R.id.train_typename, item.run_time)
                .setText(R.id.trainOpp, item.train_no)
                .setText(R.id.start_staion_type, item.start_station_type)
                .setText(R.id.end_staion_type, item.end_station_type);

        if(item.getStart_station_type().equals("始")){
            helper.setTextColor(R.id.start_staion_type, 0xFFE29049);
        }
        else if(item.getStart_station_type().equals("过")){
            helper.setTextColor(R.id.start_staion_type, 0xFF408BCA);
        }

        if(item.getEnd_station_type().equals("终")){
            helper.setTextColor(R.id.end_staion_type, 0xFF529D43);
        }
        else if(item.getEnd_station_type().equals("过")){
            helper.setTextColor(R.id.end_staion_type, 0xFF408BCA);
        }


        if(item.price_list.size() == 3){
            helper.setText(R.id.price_type_one, item.price_list.get(2).price_type + ":")
                    .setText(R.id.price_type_two, item.price_list.get(1).price_type + ":")
                    .setText(R.id.price_type_three, item.price_list.get(0).price_type + ":")
                    .setText(R.id.price_type_four, "无座" + ":")
                    .setText(R.id.price_one, item.price_list.get(2).price)
                    .setText(R.id.price_two, item.price_list.get(1).price)
                    .setText(R.id.price_three, item.price_list.get(0).price)
                    .setText(R.id.price_four, item.price_list.get(0).price);
        }
        else{
            helper.setText(R.id.price_type_one, item.price_list.get(1).price_type + ":")
                    .setText(R.id.price_type_two, item.price_list.get(0).price_type + ":")
                    .setText(R.id.price_type_three, "无座" + ":")
                    .setText(R.id.price_one, item.price_list.get(1).price)
                    .setText(R.id.price_two, item.price_list.get(0).price)
                    .setText(R.id.price_three, item.price_list.get(0).price);
        }

        //helper.addOnClickListener(R.id.tv)
                //.addOnClickListener(R.id.tv1);


    }
}
