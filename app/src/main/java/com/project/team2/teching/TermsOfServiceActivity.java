package com.project.team2.teching;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class TermsOfServiceActivity extends AppCompatActivity {

    private Button respectTerm;
    private Button proactiveTerm;
    private Button honestTerm;
    private Button safeTerm;
    private Button toProfile;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.terms_agreements);

        respectTerm = findViewById(R.id.beRespectfulTerm);
        proactiveTerm = findViewById(R.id.beProactiveTerm);
        honestTerm = findViewById(R.id.beHonestTerm);
        safeTerm = findViewById(R.id.staySafeTerm);
        toProfile = findViewById(R.id.toProfileBtn);

        respectTerm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                respectTerm.setBackgroundColor(Color.GREEN);
            }
        });

        proactiveTerm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                proactiveTerm.setBackgroundColor(Color.GREEN);
            }
        });

        honestTerm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                honestTerm.setBackgroundColor(Color.GREEN);
            }
        });

        safeTerm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                safeTerm.setBackgroundColor(Color.GREEN);
            }
        });

        toProfile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(TermsOfServiceActivity.this, FirstPageProfileInfoActivity.class);
                startActivity(intent);
            }
        });
    }
}