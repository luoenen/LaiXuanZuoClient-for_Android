package com.luosenen.huelibraryautobooked;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.io.IOException;
import java.util.Timer;
import java.util.TimerTask;

public class BookedActivity extends Activity {
    private EditText cookie;
    private Button but_start;
    private TextView showResult;
    private TextView showTimer;
    public static String js,jsCode;
    public static String result;
    public static String floor,seat_X,seat_Y;
    private double count = 0;
    private TextView web;
    Timer timer = new Timer();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_booked);
        getInfo();
        init();
        try {
            count = (MyUtils.timer()/1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        but_start.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String cookies = cookie.getText().toString().trim();
                getJsCode(cookies);
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                if (js == null){
                    Toast.makeText(getApplicationContext(),"验证系统失败，请返回重试",Toast.LENGTH_LONG).show();
                    return;
                }
                jsCode = MyUtils.cv(js.replace(".js",""));
                timer.schedule(task, 100, 100);
                but_start.setEnabled(false);

            }
        });

        web.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),MyWebActivity.class));
            }
        });
    }

    public void init(){
        cookie = findViewById(R.id.weChat_cookie);
        but_start = findViewById(R.id.start);
        showResult = findViewById(R.id.result);
        showTimer = findViewById(R.id.timer);
        web = findViewById(R.id.get_cookie);
    }

    public void getJsCode(final String cookie){

        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    js = MyUtils.getJs(MyUtils.index_url,cookie);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

        }).start();
    }

    public void booked(final  String cookie){

        if(floor.equals("0")||seat_Y.equals("0")||seat_X.equals("0")){
            Toast.makeText(getApplicationContext(),"您暂未订阅秒选服务，请线联系微信：19939374645订阅服务",Toast.LENGTH_LONG).show();
            return;
        }
        new Thread(new Runnable() {
            @Override
            public void run() {
                try {

                    String url = MyUtils.booked_url+floor+"&"+jsCode+"="+seat_X+","+seat_Y+"&yzm=";
                    result = MyUtils.netWork(url,cookie);
                    final String results = new String(result.getBytes());
                    runOnUiThread(new Runnable() {
                        @Override
                        public void run() {
                            showResult.setText(results);
                        }
                    });

                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }).start();
    }
    TimerTask task = new TimerTask() {
        @Override
        public void run() {

            runOnUiThread(new Runnable() {      // UI thread
                @Override
                public void run() {
                    count-=0.1;
                    showTimer.setText("倒计时："+count+"秒");
                    if(count < 0){
                        String cookies = cookie.getText().toString().trim();
                        booked(cookies);
                        timer.cancel();
                        showTimer.setText("7：50抢座已经结束");
                        but_start.setEnabled(true);
                    }
                }
            });
        }
    };

    public void getInfo(){
        Intent intent = getIntent();
        floor = intent.getStringExtra("floor");
        seat_X = intent.getStringExtra("seat_X");
        seat_Y = intent.getStringExtra("seat_Y");
    }
}