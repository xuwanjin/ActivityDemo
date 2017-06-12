package com.example.xuwanjin.activitydemo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    public Button startActivityExplicit;
    public Button startActivityImplicit;
    public Button startActivityFromBackground;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        startActivityExplicit = (Button) findViewById(R.id.start_activity_explicit);
        startActivityImplicit = (Button) findViewById(R.id.start_activity_implicit);
        startActivityExplicit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent explicitIntent = new Intent();
                explicitIntent.setClassName(getApplicationContext(),
                        ExplicitActivity.class.getCanonicalName());
                startActivity(explicitIntent);
            }
        });

        startActivityImplicit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent implicitIntent = new Intent("com.example.xuwanjin.activitydemo.implicitactivity");
                startActivity(implicitIntent);
            }
        });

        startActivityFromBackground = (Button) findViewById(R.id.start_activity_from_background);

        startActivityFromBackground.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent backgroundIntent = new Intent();
                backgroundIntent.setClassName(getApplicationContext(), BackgroundService.class.getName());
                startService(backgroundIntent);
            }
        });



    }
}
