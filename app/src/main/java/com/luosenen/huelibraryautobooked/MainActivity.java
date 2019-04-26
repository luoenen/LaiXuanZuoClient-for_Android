package com.luosenen.huelibraryautobooked;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.RequiresApi;
import android.support.design.widget.BottomNavigationView;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.annotation.NonNull;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;
import java.util.logging.Logger;

import cn.bmob.push.BmobPush;
import cn.bmob.v3.BmobInstallation;
import cn.bmob.v3.BmobInstallationManager;
import cn.bmob.v3.BmobQuery;
import cn.bmob.v3.BmobUser;
import cn.bmob.v3.InstallationListener;
import cn.bmob.v3.exception.BmobException;
import cn.bmob.v3.listener.FetchUserInfoListener;
import cn.bmob.v3.listener.FindListener;
import cn.bmob.v3.update.BmobUpdateAgent;

public class MainActivity extends AppCompatActivity {
    private TextView mTextMessage;
    public static String floor;
    public static String seat_X;
    public static String seat_Y;

    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            switch (item.getItemId()) {
                case R.id.index:
                    Toast.makeText(getApplicationContext(),"已经在首页了！",Toast.LENGTH_SHORT).show();
                    return true;
                case R.id.booked:
                    startActivity(new Intent(getApplicationContext(),BookedActivity.class)
                            .putExtra("floor",floor)
                            .putExtra("seat_X",seat_X)
                            .putExtra("seat_Y",seat_Y));
                    return true;
                case R.id.buy:
                    startActivity(new Intent(getApplicationContext(),BuyActivity.class));
                    return true;
            }
            return false;
        }
    };

    @RequiresApi(api = Build.VERSION_CODES.M)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //BmobUpdateAgent.initAppVersion();
        BmobUpdateAgent.setUpdateOnlyWifi(false);
        BmobUpdateAgent.update(this);
        look();
        BmobInstallationManager.getInstance().initialize(new InstallationListener<BmobInstallation>() {
            @Override
            public void done(BmobInstallation bmobInstallation, BmobException e) {
                if (e == null) {

                } else {

                }
            }
        });
        // 启动推送服务
        BmobPush.startWork(this);
        BottomNavigationView navView = findViewById(R.id.nav_view);
        mTextMessage = findViewById(R.id.message);
        MyUser user = BmobUser.getCurrentUser(MyUser.class);
        String id = user.getObjectId();
        queryUser(id);
        navView.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);
    }

    private void queryUser(final String id) {
        BmobQuery<MyUser> bmobQuery = new BmobQuery<>();
        bmobQuery.findObjects(new FindListener<MyUser>() {
            @Override
            public void done(List<MyUser> object, BmobException e) {
                if (e == null) {
                    for (MyUser user :
                            object) {
                        if (user.getObjectId().equals(id)){
                            floor = user.getFloor();
                            seat_X = user.getSeat_X();
                            seat_Y = user.getSeat_Y();
                        }
                    }
                } else {
                    Toast.makeText(getApplicationContext(),"服务器用户信息获取失败",Toast.LENGTH_SHORT).show();
                }
            }
        });
    }

    @RequiresApi(api = Build.VERSION_CODES.M)
    public void look(){
        int i = checkSelfPermission(Manifest.permission.READ_PHONE_STATE);
        if (i!= PackageManager.PERMISSION_GRANTED){
            Toast.makeText(MainActivity.this,"不开启权限会导致程序无法运行，定位失败，无法上架您的物品",Toast.LENGTH_SHORT).show();
            requestPermissions(new String[]{Manifest.permission.CALL_PHONE,Manifest.permission.READ_PHONE_STATE,Manifest.permission.ACCESS_FINE_LOCATION
                    ,Manifest.permission.ACCESS_COARSE_LOCATION,Manifest.permission.RECORD_AUDIO,Manifest.permission.READ_EXTERNAL_STORAGE
                    ,Manifest.permission.WRITE_EXTERNAL_STORAGE,Manifest.permission.CAMERA,Manifest.permission.WRITE_CONTACTS
                    ,Manifest.permission.GET_ACCOUNTS,Manifest.permission.READ_CONTACTS},1);
            return;
        }
    }

    @Override
    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults);
        if (requestCode==1){
            if (grantResults[1]==PackageManager.PERMISSION_GRANTED){
                Toast.makeText(MainActivity.this,"手机权限获取成功",Toast.LENGTH_SHORT).show();
            }else {
                Toast.makeText(MainActivity.this,"手机权限获取失败",Toast.LENGTH_SHORT).show();
            }
        }
    }
}
