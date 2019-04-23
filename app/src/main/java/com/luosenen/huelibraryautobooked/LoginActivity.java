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

public class LoginActivity extends Activity {

    private EditText userName,password;
    private ProgressBar bar;
    Button but_login,but_to_register;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        init();

        but_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                bar.setVisibility(View.VISIBLE);
                String ids = userName.getText().toString().trim();
                String passwords = password.getText().toString().trim();
                if(ids.equals("")||passwords.equals("")){
                    bar.setVisibility(View.INVISIBLE);
                    Toast.makeText(getApplicationContext(),"必选项不能为空",Toast.LENGTH_LONG).show();
                    return;
                }
                MyUser user = new MyUser();
                user.setUsername(ids);
                user.setPassword(passwords);
                user.login(new SaveListener<MyUser>() {
                    @Override
                    public void done(MyUser myUser, BmobException e) {

                        if (e == null){
                            bar.setVisibility(View.INVISIBLE);
                            Toast.makeText(getApplicationContext(),"注登陆成功，请稍后订阅座位",Toast.LENGTH_SHORT).show();
                            try {
                                Thread.sleep(2000);
                            } catch (InterruptedException e1) {
                                e1.printStackTrace();
                            }
                            startActivity(new Intent(getApplicationContext(),MainActivity.class));
                            finish();
                        }else {
                            bar.setVisibility(View.INVISIBLE);
                            Toast.makeText(getApplicationContext(),"登陆失败，请检查网络设置",Toast.LENGTH_SHORT).show();
                        }
                    }
                });
            }
        });

        but_to_register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), RegistryActivity.class);
                startActivity(intent);

            }
        });

    }

    public void init(){
        userName = findViewById(R.id.login_user_name);
        password = findViewById(R.id.login_password);
        bar = findViewById(R.id.login_bar);
        but_login = findViewById(R.id.login);
        but_to_register = findViewById(R.id.to_register);

    }


}
