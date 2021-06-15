package com.example.wangshuo.widgettwst_205ws;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewOutlineProvider;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Checkable;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.button:
                String str = et.getText().toString();
                tv.setText(str);
                break;
            case R.id.button2:
                iv.setImageResource(R.drawable.game);
                break;
            case R.id.imageButton:
                Intent intent = new Intent(MainActivity.this, NewActivity.class);
                intent.putExtra("param1", et.getText().toString());
                intent.putExtra("param2", 3);
                startActivity(intent);
                break;
        }
    }

    private TextView tv;
    private EditText et;
    private Button btngettext, btnsetimg;
    private ImageButton ibtm;
    private ImageView iv;

    private RadioButton rdnan, rdnv;
    private RadioGroup rg;
    private CheckBox cblan, cbzu, cbyu;
    private Button btgetgender, btngetfun;
    private String strfun = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
    }

    private void init() {
        tv = (TextView) findViewById(R.id.textView);
        et = (EditText) findViewById(R.id.editText);
        btngettext = (Button) findViewById(R.id.button);
        btnsetimg = (Button) findViewById(R.id.button2);
        ibtm = (ImageButton) findViewById(R.id.imageButton);
        iv = (ImageView) findViewById(R.id.imageView);
        btgetgender = (Button) findViewById(R.id.button5);
        btngetfun = (Button) findViewById(R.id.button6);

        rdnan = (RadioButton) findViewById(R.id.radioButton1);
        rdnv = (RadioButton) findViewById(R.id.radioButton2);
        rg = (RadioGroup) findViewById(R.id.radiogroup);
        cblan = (CheckBox) findViewById(R.id.checkBox);
        cbzu = (CheckBox) findViewById(R.id.checkBox2);
        cbyu = (CheckBox) findViewById(R.id.checkBox3);

        rg.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                switch (checkedId) {
                    case R.id.radioButton1:
                        tv.setText("男");
                        break;
                    case R.id.radioButton2:
                        tv.setText("女");
                        break;
                }
            }
        });
        btngettext.setOnClickListener(this);
        btnsetimg.setOnClickListener(this);
        ibtm.setOnClickListener(this);


        cblan.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked)
                    strfun += "篮球+";
                else
                    strfun = strfun.replace("篮球+", "");
                tv.setText(strfun);
            }
        });
        cbzu.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked)
                    strfun+="足球+";
                else
                    strfun=strfun.replace("足球+","");
                tv.setText(strfun);
            }
        });
        cbyu.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked)
                    strfun+="游泳+";
                else
                    strfun=strfun.replace("游泳+","");
                tv.setText(strfun);
            }
        });

    }
}
