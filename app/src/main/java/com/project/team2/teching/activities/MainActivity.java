package com.project.team2.teching.activities;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import com.project.team2.teching.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button logInBtn = findViewById(R.id.logInBtn);
        Button createAccountBtn = findViewById(R.id.createAccountBtn);

        logInBtn.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, ExistingUsersActivity.class);
            startActivity(intent);
        });

        createAccountBtn.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, NewUsersActivity.class);
            startActivity(intent);
        });
    }

    //Options Menu
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu, menu);
        return true;
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        int id = item.getItemId();

        //Info Button
        if (id == R.id.info_icon) {
            AlertDialog.Builder alertDialog = new AlertDialog.Builder(MainActivity.this);
            alertDialog.setTitle(R.string.info_title);
            alertDialog.setMessage(R.string.info_Dialog);
            alertDialog.show();
            return true;
        }

        if (id == R.id.action_settings) {
            Intent goToSettings = new Intent(this, SettingsActivity.class);
            startActivity(goToSettings);
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}