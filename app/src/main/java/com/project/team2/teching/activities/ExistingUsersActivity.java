package com.project.team2.teching.activities;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.firestore.FirebaseFirestore;
import com.project.team2.teching.R;

public class ExistingUsersActivity extends AppCompatActivity {

    private static final String TAG = ".ExistingUsersActivity";
    private Button toBioButton;
    private EditText email, password;

    private FirebaseAuth auth;
    private FirebaseFirestore db;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.returning_users);

        toBioButton = findViewById(R.id.nextbtn_toBio);

        email = findViewById(R.id.email_login);
        password = findViewById(R.id.passwordLogIn);

        auth = FirebaseAuth.getInstance();
        db = FirebaseFirestore.getInstance();


        toBioButton.setOnClickListener(v -> {
            checkCredentials();
        });
    }

    @Override
    protected void onStart() {
        super.onStart();
        FirebaseUser currentUser = auth.getCurrentUser();
        if (currentUser != null) {
            currentUser.reload();
        }
    }

    private void checkCredentials() {
        auth.signInWithEmailAndPassword(email.getText().toString(), password.getText().toString())
                .addOnCompleteListener(this, task -> {
                    if (task.isSuccessful()) {
                        Toast.makeText(this, "Logged successfully", Toast.LENGTH_SHORT).show();
                        FirebaseUser user = auth.getCurrentUser();
                        Intent intent = new Intent(this, UserBioActivity.class);
                        startActivity(intent);
                    } else {
                        Log.w(TAG, "signInWithEmail:failure", task.getException());
                        Toast.makeText(this, "Authentication failed.", Toast.LENGTH_SHORT).show();
                    }
                });
    }
}