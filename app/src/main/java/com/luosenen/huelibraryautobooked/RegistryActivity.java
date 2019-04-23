package com.luosenen.huelibraryautobooked;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.Toast;

import cn.bmob.v3.exception.BmobException;
import cn.bmob.v3.listener.SaveListener;

public class RegistryActivity extends Activity {

    private EditText userName,password;
    private ProgressBar bar;
    public Button but_registry;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registry);
        init();

        but_registry.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                bar.setVisibility(View.VISIBLE);
                String ids = userName.getText().toString().trim();
                String passwords = password.getText().toString().trim();
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                if(ids.equals("")||passwords.equals("")){
                    bar.setVisibility(View.INVISIBLE);
                    Toast.makeText(getApplicationContext(),"必选项不能为空",Toast.LENGTH_LONG).show();
                    return;
                }
                final MyUser user = new MyUser();
                user.setUsername(ids);
                user.setPassword(passwords);
                user.signUp(new SaveListener<MyUser>() {
                    @Override
                    public void done(MyUser myUser, BmobException e) {
                        if (e == null){
                            bar.setVisibility(View.INVISIBLE);
                            Toast.makeText(getApplicationContext(),"注册成功，请稍后订阅座位",Toast.LENGTH_SHORT).show();
                            try {
                                Thread.sleep(500);
                            } catch (InterruptedException e1) {
                                e1.printStackTrace();
                            }
                            startActivity(new Intent(getApplicationContext(),LoginActivity.class));
                            finish();
                        }else {
                            bar.setVisibility(View.INVISIBLE);
                            Toast.makeText(getApplicationContext(),"注册失败，请检查网络设置",Toast.LENGTH_SHORT).show();
                        }
                    }
                });
            }
        });
    }

    public void init() {
        userName = findViewById(R.id.registry_user_name);
        password = findViewById(R.id.registry_password);
        bar = findViewById(R.id.registry_bar);
        but_registry = findViewById(R.id.registry);
    }
}
