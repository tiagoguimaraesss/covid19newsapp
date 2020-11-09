package com.example.covid19newsapp.ui.activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

import com.example.covid19newsapp.R;

public class OnBoardingTwoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.onboarding_screen_two_activity);
        configureButtonTwo();
        configureButton();
    }

    private void configureButton() {
        ImageButton buttonOnboarding = findViewById(R.id.arrow_1);
        buttonOnboarding.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                goesToOnBoardingThree();
            }
        });
    }

    private void configureButtonTwo() {
        ImageButton buttonOnboarding = findViewById(R.id.arrow_2);
        buttonOnboarding.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                goesToOnBoardingOne();
            }
        });
    }


    private void goesToOnBoardingOne() {
        Intent intent = new Intent(this, OnBoardingOneActivity.class);
        startActivity(intent);
        finish();
    }

    private void goesToOnBoardingThree() {
        Intent intent = new Intent(this, OnBoardingThreeActivity.class);
        startActivity(intent);
        finish();
    }

}
