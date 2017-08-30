package com.mydemo.branchdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //frist commit

        MasterActivity.start(this);

        //master
        MyActivity.start(this);

        //Branch1
        BranchActivity.start(this);

        //zhu fen zhi
        int z = R.mipmap.z;

        int wechatIMG15 = R.mipmap.WechatIMG15;

    }
}
