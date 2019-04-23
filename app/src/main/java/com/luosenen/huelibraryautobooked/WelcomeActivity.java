package com.luosenen.huelibraryautobooked;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import cn.bmob.v3.Bmob;

public class WelcomeActivity extends Activity {
    private final Handler handler = new Handler();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);
        Bmob.initialize(this, "df900de80e8315cd42bd44b08567c5f3");
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(getApplicationContext(),LoginActivity.class);
                startActivity(intent);
            }
        },1000);
    }
}
