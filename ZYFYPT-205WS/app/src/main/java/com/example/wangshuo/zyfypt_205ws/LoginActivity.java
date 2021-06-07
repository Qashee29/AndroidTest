package com.example.wangshuo.zyfypt_205ws;


import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class LoginActivity extends AppCompatActivity implements View.OnClickListener{
    private TextView tv1;
    private TextView tvname;
    private TextView tvpassward;
    private EditText edname;
    private EditText edpassword;
    private Button btland;
    private Button btregister;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        init();
        btregister.setOnClickListener(this);
        btland.setOnClickListener(this);
    }


    private void init() {
        tv1=(TextView)findViewById(R.id.textView);
        tvname=(TextView)findViewById(R.id.textView2);
        tvpassward=(TextView)findViewById(R.id.textView3);
        edname=(EditText)findViewById(R.id.editText);
        edpassword=(EditText)findViewById(R.id.editText2);
        btregister=(Button)findViewById(R.id.button2);
        btland=(Button)findViewById(R.id.button);
    }
    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.button2:
                Handler handler=new Handler();
                startActivity(new Intent(getApplication(),RegisterActivity.class));
                LoginActivity.this.finish();
                break;
        }
    }
}
