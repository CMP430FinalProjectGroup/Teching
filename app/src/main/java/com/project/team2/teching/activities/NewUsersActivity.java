package com.project.team2.teching.activities;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.project.team2.teching.R;

public class NewUsersActivity extends AppCompatActivity {

    private static final String TAG = ".NewUsersActivity";
    private static final String EXTRA_MESSAGE = "MESSAGE";
    private Button toNewUserInfoPage;
    private EditText username;
    private EditText userEmail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.new_users);

        toNewUserInfoPage = findViewById(R.id.nextBtn_NewUserInfoAct);
        username = findViewById(R.id.name_register);
        userEmail = findViewById(R.id.email_register);

        toNewUserInfoPage.setOnClickListener(v -> {
            if (checkEditText(username, "Please provide a Username!") &&
                    checkEditText(userEmail, "Please provide a valid Email!")) {
                createUser(username.getText().toString(), userEmail.getText().toString());
            }
        });
    }

    private boolean checkEditText(EditText input, String errorMsg) {
        if (TextUtils.isEmpty(input.getText().toString())) {
            Toast.makeText(this, errorMsg, Toast.LENGTH_SHORT).show();
            return false;
        }
        return true;
    }

    public void createUser(String username, String email) { // Launches the new_user_info_activity
        Log.d(TAG, "createUser: username = " + username);
        Log.d(TAG, "createUser: email = " + email);

        Intent intent = new Intent(this, NewUsersInfoActivity.class);
        String[] data = {username, email};

        intent.putExtra(EXTRA_MESSAGE, data); // send the username and email to the activity
        startActivity(intent);
    }

}
