package com.project.team2.teching;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class NewUsersInfoActivity extends AppCompatActivity {

    private Button toTermsAndPage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.new_users_info);

        toTermsAndPage = findViewById(R.id.nextBtn_termsAct);

        toTermsAndPage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(NewUsersInfoActivity.this, TermsOfServiceActivity.class);
                startActivity(intent);
            }
        });

    }
}