package com.example.xuwanjin.activitydemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

/**
 * Created by xuwanjin on 6/11/17.
 */

public class ExplicitActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.explicit_activity);
        String x = Integer.toHexString(getIntent().getFlags());
        Toast.makeText(getApplicationContext(), x , Toast.LENGTH_SHORT).show();
    }

}
