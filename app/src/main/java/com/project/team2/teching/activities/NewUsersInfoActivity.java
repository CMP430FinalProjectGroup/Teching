package com.project.team2.teching.activities;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ComponentActivity;

import com.project.team2.teching.R;

public class NewUsersInfoActivity extends AppCompatActivity {

    private Button toTermsAndPage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.new_users_info);

        toTermsAndPage = findViewById(R.id.nextBtn_termsAct);

        Intent getNewUsersActivityIntent = getIntent();

//        String[] data = getNewUsersActivityIntent.getStringArrayExtra(NewUsersActivity)

        toTermsAndPage.setOnClickListener(v -> {
            Intent intent = new Intent(NewUsersInfoActivity.this, TermsOfServiceActivity.class);
            startActivity(intent);
        });

    }
}