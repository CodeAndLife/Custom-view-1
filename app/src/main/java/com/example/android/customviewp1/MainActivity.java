package com.example.android.customviewp1;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        DurationTextView durationView1 = (DurationTextView) findViewById(R.id.durationview1);
        durationView1.setDuration(250);

        DurationTextView durationView2 = (DurationTextView) findViewById(R.id.durationview2);
        durationView2.setDuration(780);

        DurationTextView durationView3 = (DurationTextView) findViewById(R.id.durationview3);
        durationView3.setDuration(2378);

        DurationTextView durationView4 = (DurationTextView) findViewById(R.id.durationview4);
        durationView4.setDuration(3670);

        DurationTextView durationView5 = (DurationTextView) findViewById(R.id.durationview5);
        durationView5.setDuration(18550);
    }

}
