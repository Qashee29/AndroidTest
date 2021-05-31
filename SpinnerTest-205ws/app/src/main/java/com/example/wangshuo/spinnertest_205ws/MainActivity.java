package com.example.wangshuo.spinnertest_205ws;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView tvinfo;
    private Spinner spinner;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
        //定义数据源
        String[] cities={"北京","上海","大连","天津"};
        //定义适配器
        final ArrayAdapter<String> adapter=new ArrayAdapter<String>(this,//上下文
                android.R.layout.simple_spinner_item,//条目布局
                cities);//数据源
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_item);//Spinner与Adapter绑定
        spinner.setAdapter(adapter);//spinner点击条目事件
        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                tvinfo.setText("您选择的是："+parent.getItemAtPosition(position).toString());
            }
            @Override
            public void onNothingSelected(AdapterView<?> parent) {
            }
        });
    }
    private void init(){
        tvinfo=(TextView)findViewById(R.id.textView);
        spinner=(Spinner)findViewById(R.id.spinner);

    }

}
