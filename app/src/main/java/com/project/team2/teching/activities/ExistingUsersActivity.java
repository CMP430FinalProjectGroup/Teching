package com.project.team2.teching.activities;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.project.team2.teching.R;

public class ExistingUsersActivity extends AppCompatActivity {

    private Button toBioButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.returning_users);

        toBioButton = findViewById(R.id.nextbtn_toBio);

        toBioButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ExistingUsersActivity.this, UserBioActivity.class);
                startActivity(intent);
            }
        });
    }
}