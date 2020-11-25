package com.miron.carbtmusic;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //本来打算写一个demo，懒了，还是提供一个蓝牙管理类的接口，使用的时候调用一下
        // ,为了保证隐藏文件编译通过，这里提供了一个编译好的 framework.jar
    }
}