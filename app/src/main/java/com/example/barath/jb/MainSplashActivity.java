package com.example.barath.jb;

import android.app.Activity;
import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainSplashActivity extends Activity {
    private static  int SPLASHTIME = 4000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_splash);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent homeintent = new Intent(MainSplashActivity.this,firstpage.class);
                startActivity(homeintent);
                finish();

            }
        },SPLASHTIME);
    }
}
