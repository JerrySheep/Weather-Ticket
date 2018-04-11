package openapiinvoker.example.com.weatherandticket;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import com.chad.library.adapter.base.BaseQuickAdapter;

public class TicketShow extends AppCompatActivity {
    RecyclerView recyclerView;
    TextView leaveStation;
    TextView arriveStation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ticket_show);
        Intent intent = this.getIntent();
        TrainBean trainBean = (TrainBean) intent.getSerializableExtra("trainBean");
        String leaveCity = intent.getStringExtra("leaveCity");
        String arriveCity = intent.getStringExtra("arriveCity");



        //Toast.makeText(TicketShow.this, trainBean.result.list.get(1).toString(), Toast.LENGTH_LONG).show();
        initRv(trainBean, leaveCity, arriveCity);
    }

    private void initRv(TrainBean trainBean, String leaveCity, String arriveCity) {
        recyclerView = (RecyclerView)findViewById(R.id.recycler_view);


        RecyclerView.LayoutManager manager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(manager);

        BrvahAdapter adapter = new BrvahAdapter(R.layout.item, trainBean.result.list);


        adapter.isFirstOnly(false);
        adapter.openLoadAnimation(BaseQuickAdapter.SLIDEIN_RIGHT);

        View view = getLayoutInflater().inflate(R.layout.ticket_head_view, (ViewGroup) recyclerView.getParent(), false);

        leaveStation = view.findViewById(R.id.leave);
        arriveStation = view.findViewById(R.id.arrive);
        leaveStation.setText(leaveCity);
        arriveStation.setText(arriveCity);


        adapter.addHeaderView(view);

        recyclerView.setAdapter(adapter);

        if(trainBean.result.list.size() == 0){
            Toast.makeText(TicketShow.this, "所选择限制下无车辆，请重新进行选择", Toast.LENGTH_LONG).show();
        }
    }
}
