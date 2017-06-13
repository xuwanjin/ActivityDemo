package com.example.xuwanjin.activitydemo;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

/**
 * Created by xuwanjin on 6/13/17.
 */

public class StartFromBackgroundActivity extends AppCompatActivity {

    TextView startedActivityFromBackground;
    @Override
    public void onCreate(@Nullable Bundle savedInstanceState, @Nullable PersistableBundle persistentState) {
        super.onCreate(savedInstanceState, persistentState);
        setContentView(R.layout.start_from_background_activity);
        startedActivityFromBackground = (TextView) findViewById(R.id.started_activity_from_background);
    }
}
