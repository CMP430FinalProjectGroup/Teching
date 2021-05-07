package com.project.team2.teching.activities;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.project.team2.teching.R;

public class MainActivity extends AppCompatActivity {

    private Button LogInBtn;
    private Button createAccountBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        LogInBtn = findViewById(R.id.logInBtn);
        createAccountBtn = findViewById(R.id.createAccountBtn);

        LogInBtn.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, ExistingUsersActivity.class);
            startActivity(intent);
        });

        createAccountBtn.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, NewUsersActivity.class);
            startActivity(intent);
        });
    }
}