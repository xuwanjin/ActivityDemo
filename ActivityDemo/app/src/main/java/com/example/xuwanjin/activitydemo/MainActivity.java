package com.example.xuwanjin.activitydemo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    public Button startActivityExplicit;
    public Button startActivityImplicit;

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
                Intent implicitIntent = new Intent();
                startActivity(implicitIntent);
            }
        });
    }
}
