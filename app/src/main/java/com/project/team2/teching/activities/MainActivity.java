package com.project.team2.teching.activities;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.project.team2.teching.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button logInBtn = findViewById(R.id.logInBtn);
        Button createAccountBtn = findViewById(R.id.createAccountBtn);

        logInBtn.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, ExistingUsersActivity.class);
            startActivity(intent);
        });

        createAccountBtn.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, NewUsersActivity.class);
            startActivity(intent);
        });
    }
}