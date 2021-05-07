package com.project.team2.teching;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class NewUsersActivity extends AppCompatActivity {

    private Button toNewUserPage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.new_users);

        toNewUserPage = findViewById(R.id.nextBtn_NewUserInfoAct);

        toNewUserPage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(NewUsersActivity.this, NewUsersInfoActivity.class);
                startActivity(intent);
            }
        });
    }
}
