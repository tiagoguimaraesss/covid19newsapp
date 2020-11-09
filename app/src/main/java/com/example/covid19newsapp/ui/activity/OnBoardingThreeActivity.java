package com.example.covid19newsapp.ui.activity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

import com.example.covid19newsapp.R;

public class OnBoardingThreeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.onboarding_screen_three_activity);
        configureButton();
        configureButtonTwo();
    }

    private void configureButton() {
        ImageButton buttonOnboarding = findViewById(R.id.arrow_1);
        buttonOnboarding.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                goToLoginForm();
            }
        });
    }

    private void configureButtonTwo() {
        ImageButton buttonOnboarding = findViewById(R.id.arrow_2);
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

    private void goToLoginForm() {
        SharedPreferences preferences = getSharedPreferences("my_preferences", MODE_PRIVATE);
        preferences.edit().putBoolean("onboarding_complete", true).apply();
        Intent intent = new Intent(this, LoginActivity.class);
        startActivity(intent);
        finish();
    }

}
