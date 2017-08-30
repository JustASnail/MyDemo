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

        //Branch1
        BranchActivity.start(this);

        int wechatIMG15 = R.mipmap.WechatIMG15;

    }
}
