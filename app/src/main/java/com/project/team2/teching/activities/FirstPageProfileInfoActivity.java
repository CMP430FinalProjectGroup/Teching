package com.project.team2.teching.activities;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.project.team2.teching.R;

public class FirstPageProfileInfoActivity extends AppCompatActivity {

    private Button secondInfoPage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.profile_info_1of2);

        secondInfoPage = findViewById(R.id.nextbtn_secondPageInfo);

        secondInfoPage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(FirstPageProfileInfoActivity.this, SecondPageProfileInfoActivity.class);
                startActivity(intent);
            }
        });
    }
}