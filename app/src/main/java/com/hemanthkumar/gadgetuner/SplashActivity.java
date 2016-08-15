package com.hemanthkumar.gadgetuner;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.text.format.DateUtils;


public class SplashActivity extends Activity {

    private Handler mHandler;
    private Runnable mGoNextRunnable;
    private static final long SPLASH_TIME_OUT = DateUtils.SECOND_IN_MILLIS * 3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        mHandler = new Handler();
        mGoNextRunnable = new Runnable() {
            @Override
            public void run() {
                startActivity(new Intent(SplashActivity.this, MainActivity.class));
                finish();
            }
        };

        mHandler.postDelayed(mGoNextRunnable, SPLASH_TIME_OUT);


    }
}
