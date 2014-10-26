package com.omar.selftastic.app;

import android.content.Context;
import android.content.Intent;
import android.location.LocationManager;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;


public class StartActivity extends ActionBarActivity {
    private android.os.Handler handler = new android.os.Handler();

    @Override
    protected void onStart() {
        super.onStart();
    }

    @Override
    protected void onStop() {
        super.onStop();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_start);
        LocationHolder.manager = (LocationManager) getSystemService(Context.LOCATION_SERVICE);

        // Delay needs to be checked for input sanitization, i.e. if the user presses a button
        // while we are delayed, what happens? Does the app respond? Crash? etc.
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                // Do something after 10s = 10000ms
                startActivity(new Intent(getApplicationContext(), MainActivity.class));
                finish();
                // You could do this call if you wanted it to be periodic:
            }
        }, 1000);   // Temporary 1 second delay. Change to 3 seconds in the future.
    }

}
