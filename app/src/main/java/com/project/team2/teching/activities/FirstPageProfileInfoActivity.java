package com.project.team2.teching.activities;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import com.project.team2.teching.R;

import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class FirstPageProfileInfoActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener {

    private static final String TAG = ".FirstPageProfileInfoActivity";
    public static final String EXTRA_MESSAGE = "com.project.team2.teching.activities.FirstPageProfileInfoActivity.PROFILE_ONE";
    private EditText name, location;
    private DatePicker dateOfBirthPicker;
    private Spinner genderSpinner;

    private String gender;
    private boolean isGenderSelected;

    @RequiresApi(api = Build.VERSION_CODES.N)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.profile_info_1of2);

        Button secondInfoPage = findViewById(R.id.nextbtn_secondPageInfo);
        name = findViewById(R.id.nameText_Insert);
        dateOfBirthPicker = findViewById(R.id.date_of_birth_picker);
        location = findViewById(R.id.location_Insert);
        genderSpinner = findViewById(R.id.gender_spinner_profile_info);

        isGenderSelected = false;

        dateOfBirthPicker.setMaxDate(new Date().getTime());

        setupSpinner();

        secondInfoPage.setOnClickListener(v -> {
            if (checkAllInputs()) {
                String dateOfBirth = String.format(Locale.US, "%02d/%02d/%04d", dateOfBirthPicker.getMonth(),
                        dateOfBirthPicker.getDayOfMonth(), dateOfBirthPicker.getYear());
                addProfile(name.getText().toString(), dateOfBirth, gender, location.getText().toString());
            }
        });
    }

    private void addProfile(String name, String dateOfBirth, String gender, String location) {
        startActivity(new Intent().putExtra(EXTRA_MESSAGE, new String[]{name, dateOfBirth, gender, location}));
    }

    private boolean checkAllInputs() {
        logMsg();
        return checkEditText(name, "Please provide a Username!") &&
                checkDate(dateOfBirthPicker) &&
                checkSpinnerGender("Please provide a Password") &&
                checkEditText(location, "Please confirm you password");
    }

    private boolean checkDate(DatePicker dateOfBirthPicker) {
        if (Calendar.YEAR - dateOfBirthPicker.getYear() < 18) {
            Toast.makeText(this, "You are under 18 year old", Toast.LENGTH_SHORT).show();
            return false;
        }
        return true;
    }

    /**
     * Taking break
     *
     * @return
     */

    private boolean checkEditText(EditText input, String errorMsg) {
        if (TextUtils.isEmpty(input.getText().toString())) {
            Toast.makeText(this, errorMsg, Toast.LENGTH_SHORT).show();
            return false;
        }
        return true;
    }

    private boolean checkSpinnerGender(String errorMsg) {
        if (!isGenderSelected) {
            Toast.makeText(this, errorMsg, Toast.LENGTH_SHORT).show();
            return isGenderSelected;
        }
        return isGenderSelected;
    }

    public void setupSpinner() {
        ArrayAdapter<CharSequence> genderAdapter = ArrayAdapter.createFromResource(this,
                R.array.gender_values, R.layout.profile_info_1of2);
        if (genderSpinner != null) {
            genderSpinner.setOnItemSelectedListener(this);
            genderSpinner.setAdapter(genderAdapter);
        }
    }

    @SuppressLint("LongLogTag")
    public void logMsg() {
        Log.d(TAG, "addUser: name = " + name);
        Log.d(TAG, "addUser: date of birth = " + dateOfBirthPicker);
        Log.d(TAG, "addUser: gender = " + gender);
        Log.d(TAG, "addUser: location = " + location);
    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        this.gender = parent.getItemAtPosition(position).toString();
        isGenderSelected = !this.gender.equals(parent.getItemAtPosition(0));
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {
        checkSpinnerGender("Please select your gender");
    }
}