package com.example.covid19newsapp.ui.activity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

import com.example.covid19newsapp.R;

public class OnBoardingOneActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.onboarding_screen_one_activity);
        configureButton();
    }

    private void configureButton() {
        ImageButton buttonOnboarding = findViewById(R.id.arrow_1);
        buttonOnboarding.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                goesToOnBoardingTwo();
            }
        });
    }

    private void goesToOnBoardingTwo() {
        Intent intent = new Intent(this, OnBoardingTwoActivity.class);
        startActivity(intent);
        finish();
    }

}
