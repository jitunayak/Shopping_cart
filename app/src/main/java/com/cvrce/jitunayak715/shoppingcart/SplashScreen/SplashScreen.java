package com.cvrce.jitunayak715.shoppingcart.SplashScreen;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import com.cvrce.jitunayak715.shoppingcart.R;
import com.cvrce.jitunayak715.shoppingcart.TabLayout.MainActivity;
import com.cvrce.jitunayak715.shoppingcart.login.Login;

import gr.net.maroulis.library.EasySplashScreen;

public class SplashScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        EasySplashScreen config= new EasySplashScreen(SplashScreen.this)
                .withFullScreen()
                .withTargetActivity(Login.class)
                .withSplashTimeOut(2000)
                .withBackgroundResource(android.R.color.holo_blue_dark)
                .withFooterText("Copyright jitunayak715@2018 ")
                .withBeforeLogoText("FlipKart")
                .withLogo(R.drawable.mall)
                .withAfterLogoText("india's number one online shopping");


        config.getFooterTextView().setTextColor(Color.WHITE);
        config.getAfterLogoTextView().setTextColor(Color.WHITE);
        config.getBeforeLogoTextView().setTextColor(Color.WHITE);

        View easySplashScreenView = config.create();
        setContentView(easySplashScreenView);
    }
}
