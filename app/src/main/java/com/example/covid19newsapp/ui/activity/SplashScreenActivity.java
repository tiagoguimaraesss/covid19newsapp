package com.example.covid19newsapp.ui.activity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Handler;

import androidx.appcompat.app.AppCompatActivity;

import com.example.covid19newsapp.R;

public class SplashScreenActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash_screen_activity);
        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                SplashScreenActivity.this.checkFirstTimeStartingApp();
            }
        }, 3000);
    }

    private void checkFirstTimeStartingApp() {
        SharedPreferences preferences = getSharedPreferences("my_preferences", MODE_PRIVATE);
        if(preferences.getBoolean("onboarding_complete", false)) {
            showLoginFormActivity();
        }else{
            showOnBoardingActivity();
        }
    }

    private void showOnBoardingActivity() {
        Intent intent = new Intent(this, OnBoardingOneActivity.class);
        startActivity(intent);
        finish();
    }

    private void showLoginFormActivity() {
        Intent intent = new Intent(this, LoginActivity.class);
        startActivity(intent);
        finish();
    }

}
