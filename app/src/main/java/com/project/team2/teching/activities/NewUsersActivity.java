package com.project.team2.teching.activities;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.firestore.FirebaseFirestore;
import com.project.team2.teching.R;
import com.project.team2.teching.models.UserModel;

public class NewUsersActivity extends AppCompatActivity {

    private static final String TAG = ".NewUsersActivity";
    private static final String EXTRA_MESSAGE = "MESSAGE";

    private EditText username;
    private EditText email;
    private EditText password;
    private EditText confirmPassword;

    private FirebaseFirestore db;
    private FirebaseAuth userAuth;
    private UserModel userModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.new_users);

        Button toTOSPage = findViewById(R.id.nextBtn_termsAct);
        username = findViewById(R.id.username_register);
        email = findViewById(R.id.email_register);
        password = findViewById(R.id.password_register);
        confirmPassword = findViewById(R.id.confirm_password_register);
        db = FirebaseFirestore.getInstance();
        userAuth = FirebaseAuth.getInstance();
        userModel = new UserModel();

        toTOSPage.setOnClickListener(v -> {
            if (checkAllInputs() &&
                    confirmPassword(password, confirmPassword)) {
                addUser(username.getText().toString(), email.getText().toString(), password.getText().toString());
            }
        });
    }

    private boolean checkAllInputs() {
        logMsg();
        return checkEditText(username, "Please provide a Username!") &&
                checkEditText(email, "Please provide an Email!") &&
                checkEditText(password, "Please provide a Password") &&
                checkEditText(confirmPassword, "Please confirm you password") &&
                checkPassword(password);
    }

    private boolean checkPassword(EditText password) {
        if (password.getText().toString().length() < 6) {
            Toast.makeText(this, "Password should be at least 6 characters", Toast.LENGTH_SHORT).show();
            return false;
        }
        return true;
    }

    private boolean confirmPassword(EditText password, EditText confirmPassword) {
        if (!password.getText().toString().equals(confirmPassword.getText().toString())) {
            Toast.makeText(this, "The passwords do not match...", Toast.LENGTH_SHORT).show();
            return false;
        }
        return password.getText().toString().equals(confirmPassword.getText().toString());
    }

    private boolean checkEditText(EditText input, String errorMsg) {
        if (TextUtils.isEmpty(input.getText().toString())) {
            Toast.makeText(this, errorMsg, Toast.LENGTH_SHORT).show();
            return false;
        }
        return true;
    }

    // Emmanuel code adapted
    public void addUser(String username, String email, String password) { // Launches the new_user_info_activity
        logMsg();

        userAuth.createUserWithEmailAndPassword(email, password).addOnCompleteListener(task -> {
            if (task.isSuccessful()) {
                task.addOnSuccessListener(authResult -> {
                    userModel.setUsername(username);
                    userModel.setEmail(email);
                    userModel.setPassword(password);
                    db.collection("Users").document().set(userModel)
                            .addOnSuccessListener(aVoid -> {
                                startActivity(new Intent(NewUsersActivity.this,
                                        TermsOfServiceActivity.class)); // To Terms Of Service Activity
                                Toast.makeText(this, "Account created successfully", Toast.LENGTH_SHORT).show();
                            });
                });
            } else {
                Toast.makeText(this, "System error: Try again later", Toast.LENGTH_LONG).show(); // For the user
                Log.d(TAG, "addUser: System error => " + task.getException()); // For debugging
            }
        });

    }

    public void logMsg() {
        Log.d(TAG, "addUser: username = " + username);
        Log.d(TAG, "addUser: email = " + email);
        Log.d(TAG, "addUser: password = " + password);
        Log.d(TAG, "addUser: confirm password = " + confirmPassword);
    }

}