package com.project.team2.teching.activities;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.project.team2.teching.R;

public class TermsOfServiceActivity extends AppCompatActivity {

    private Button respectTerm;
    private Button proactiveTerm;
    private Button honestTerm;
    private Button safeTerm;
    private boolean hasCheckedRespectTerm = false, hasCheckedProactiveTerm = false,
            hasCheckedHonestTerm = false, hasCheckedSafeTerm = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.terms_agreements);

        respectTerm = findViewById(R.id.beRespectfulTerm);
        proactiveTerm = findViewById(R.id.beProactiveTerm);
        honestTerm = findViewById(R.id.beHonestTerm);
        safeTerm = findViewById(R.id.staySafeTerm);
        Button toProfile = findViewById(R.id.toProfileBtn);

        respectTerm.setOnClickListener(v -> {
            respectTerm.setBackgroundColor(Color.GREEN);
            hasCheckedRespectTerm = true;
            if (isAllGreen()){
                toProfile.setEnabled(true);
            }
        });

        proactiveTerm.setOnClickListener(v -> {
            proactiveTerm.setBackgroundColor(Color.GREEN);
            hasCheckedProactiveTerm = true;
            if (isAllGreen()){
                toProfile.setEnabled(true);
            }
        });

        honestTerm.setOnClickListener(v -> {
            honestTerm.setBackgroundColor(Color.GREEN);
            hasCheckedHonestTerm = true;
            if (isAllGreen()){
                toProfile.setEnabled(true);
            }
        });

        safeTerm.setOnClickListener(v -> {
            safeTerm.setBackgroundColor(Color.GREEN);
            hasCheckedSafeTerm = true;
            if (isAllGreen()){
                toProfile.setEnabled(true);
            }
        });

        toProfile.setOnClickListener(v -> {
            if (isAllGreen()) {
//                startActivity(new Intent(this, FirstPageProfileInfoActivity.class));
                Intent intent = new Intent(TermsOfServiceActivity.this, ExistingUsersActivity.class);
                startActivity(intent);
            }else
                Toast.makeText(this, "Please accept all the terms to proceed.", Toast.LENGTH_SHORT).show();
        });
    }

    public boolean isAllGreen() {
        return hasCheckedHonestTerm && hasCheckedSafeTerm && hasCheckedProactiveTerm && hasCheckedRespectTerm;
    }
}