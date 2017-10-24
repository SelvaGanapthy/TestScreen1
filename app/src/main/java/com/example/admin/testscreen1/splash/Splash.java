package com.example.admin.testscreen1.splash;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.example.admin.testscreen1.R;
import com.example.admin.testscreen1.login.MainActivity;

import gr.net.maroulis.library.EasySplashScreen;

public class Splash extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EasySplashScreen screen=new EasySplashScreen(Splash.this)
                .withFullScreen()
                .withSplashTimeOut(3000)
                .withBackgroundResource(R.drawable.splashscreen)
                .withTargetActivity(MainActivity.class);
        View v=screen.create();
        setContentView(v);
    }
}
