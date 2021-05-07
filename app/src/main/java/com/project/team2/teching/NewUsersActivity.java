package com.project.team2.teching;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.firestore.FirebaseFirestore;

public class NewUsersActivity extends AppCompatActivity {

    private Button toNewUserPage;
    private EditText userName;
    private EditText userEmail;

    private FirebaseFirestore userTable;
    private FirebaseAuth userAuth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.new_users);

        toNewUserPage = findViewById(R.id.nextBtn_NewUserInfoAct);
        userName = findViewById(R.id.name_register);
        userEmail = findViewById(R.id.email_register);

        userTable = FirebaseFirestore.getInstance();
        userAuth = FirebaseAuth.getInstance();


        toNewUserPage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(NewUsersActivity.this, NewUsersInfoActivity.class);
                startActivity(intent);
            }
        });
    }
}
