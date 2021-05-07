package com.project.team2.teching;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class SecondPageProfileInfoActivity extends AppCompatActivity {

    private Button toBioButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.profile_info_2of2);

        toBioButton = findViewById(R.id.secondInfoPage_toBio);

        toBioButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SecondPageProfileInfoActivity.this, UserBioActivity.class);
                startActivity(intent);
            }
        });
    }
}
