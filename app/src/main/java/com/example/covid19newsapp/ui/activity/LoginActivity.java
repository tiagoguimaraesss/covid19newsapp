package com.example.covid19newsapp.ui.activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.covid19newsapp.R;

public class LoginActivity extends AppCompatActivity {

    public static final String EMAIL = "teste@email.com.br";
    public static final String PASSWORD = "123456";
    public static final String ERROR_MESSAGE = "E-mail e/ou senha inválido!";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_screen_activity);
        configureButton();
    }

    private void configureButton() {
        final Button enterButton = findViewById(R.id.login_button);
        enterButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (LoginActivity.this.doLogin()) {
                    Intent intent = new Intent(LoginActivity.this, HomeActivity.class);
                    LoginActivity.this.startActivity(intent);
                    LoginActivity.this.finish();
                } else {
                    Toast.makeText(LoginActivity.this, ERROR_MESSAGE, Toast.LENGTH_LONG).show();
                }
            }
        });
    }

    private boolean doLogin() {
        final EditText inputEmail = findViewById(R.id.editTextTextEmailAddress);
        final EditText inputPassword = findViewById(R.id.editTextNumberPassword);

        return (inputEmail.getText().toString().equals(EMAIL)) && (inputPassword.getText().toString().equals(PASSWORD));
    }

}
