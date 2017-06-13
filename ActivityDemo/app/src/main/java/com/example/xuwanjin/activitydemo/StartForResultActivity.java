package com.example.xuwanjin.activitydemo;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by xuwanjin on 6/13/17.
 */

public class StartForResultActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.start_for_result_activity);
        Intent intent = new Intent();
        intent.putExtra("xuwanjin", "hello");
        setResult(RESULT_OK,intent);
    }


}
