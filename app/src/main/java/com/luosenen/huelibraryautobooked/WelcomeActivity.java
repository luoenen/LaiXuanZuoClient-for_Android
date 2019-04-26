package com.luosenen.huelibraryautobooked;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.os.Handler;
import android.support.v4.content.res.ResourcesCompat;
import android.view.Window;
import android.widget.TextView;

import cn.bmob.v3.Bmob;

public class WelcomeActivity extends Activity {
    private TextView welcome_txt;
    private final Handler handler = new Handler();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_welcome);
        welcome_txt = findViewById(R.id.welcome_text);
        Typeface typeface = ResourcesCompat.getFont(this, R.font.font);
        welcome_txt.setTypeface(typeface);
        Bmob.initialize(this, "df900de80e8315cd42bd44b08567c5f3");
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(getApplicationContext(),LoginActivity.class);
                startActivity(intent);
                finish();
            }
        },3000);
    }
}
