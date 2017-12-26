package com.example.shawnzhang.trueheart;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;

public class Developer extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // 这部分内容一定要在setContentView()之前调用
        getWindow().addFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN);
        // 去掉窗口标题
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_developer);
    }
}
