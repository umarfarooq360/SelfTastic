package com.omar.selftastic.app;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;


public class StartActivity extends ActionBarActivity {

    private android.os.Handler handler = new android.os.Handler();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start);

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


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.start, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

}
