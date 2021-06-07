package com.example.wangshuo.zyfypt_205ws;
import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Handler handler=new Handler();
        handler.postDelayed(new splashhander(),3000);
    }
    class splashhander implements Runnable{
        public void run(){
            startActivity(new Intent(getApplication(),LoginActivity.class));
            MainActivity.this.finish();
        }
    }

}
