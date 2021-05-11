package com.project.team2.teching.activities;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.SwitchCompat;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.firestore.CollectionReference;
import com.google.firebase.firestore.FirebaseFirestore;
import com.project.team2.teching.R;
import com.project.team2.teching.models.ProfileModel;
import com.project.team2.teching.models.UserModel;

public class SecondPageProfileInfoActivity extends AppCompatActivity implements CompoundButton.OnCheckedChangeListener {

    private static final String TAG = ".SecondPageProfileInfoActivity";
    private FirebaseAuth profileAuth;
    private FirebaseFirestore db;
    private ProfileModel profileModel;
    private UserModel userModel;
    private CollectionReference docRef;


    private SwitchCompat menSwitch, womenSwitch;
    private EditText ageMinInput, ageMaxInput;
    private EditText bioEditText;
    private String name, dateOfBirth, gender, location;
    private boolean preferMen, preferWomen;
    private boolean[] genderPref;
    private int[] ageRange;

    public SecondPageProfileInfoActivity() {
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.profile_info_2of2);

        Button toBioButton = findViewById(R.id.secondInfoPage_toBio);
        menSwitch = findViewById(R.id.men_switch);
        womenSwitch = findViewById(R.id.women_switch);
        ageMinInput = findViewById(R.id.age_minInput);
        ageMaxInput = findViewById(R.id.age_maxInput);
        bioEditText = findViewById(R.id.bio_input);
        preferMen = false;
        preferWomen = false;
        ageRange = new int[]{0, 0};
        genderPref = new boolean[]{preferMen, preferWomen};

        profileAuth = FirebaseAuth.getInstance();
        db = FirebaseFirestore.getInstance();
        profileModel = new ProfileModel();
        userModel = new UserModel();

        Intent profileInfoPage1 = getIntent();

        String[] profileInfoData = profileInfoPage1.getStringArrayExtra(FirstPageProfileInfoActivity.EXTRA_MESSAGE);

        name = profileInfoData[0];
        dateOfBirth = profileInfoData[1];
        gender = profileInfoData[2];
        location = profileInfoData[3];

        toBioButton.setOnClickListener(v -> {
            if (checkAllInputs()) {
                setAgeRange();
                addProfile(name, dateOfBirth, gender, location, genderPref, ageRange, bioEditText.getText().toString());
            }
        });
    }

    private void addProfile(String name, String dateOfBirth, String gender, String location, boolean[] genderPref,
                            int[] ageRange, String bio) {
        profileModel.setName(name);
        profileModel.setDateOfBirth(dateOfBirth);
        profileModel.setGender(gender);
        profileModel.setLocation(location);
        profileModel.setGenderPref(genderPref);
        profileModel.setAgeRange(ageRange);
        profileModel.setBio(bio);
        db.collection("Profiles").document().set(profileModel)
                .addOnSuccessListener(aVoid -> {
                    userModel.setProfileId(db.collection("Profiles").document().getId());
                    db.collection("Users").document().set(userModel);
                    Toast.makeText(this, "Profile created successfully", Toast.LENGTH_SHORT).show();
                });
    }

    private void setGenderPref() {
        genderPref = new boolean[]{preferMen, preferWomen};
    }

    private void setAgeRange() {
        ageRange = new int[]{Integer.parseInt(ageMinInput.getText().toString()),
                Integer.parseInt(ageMaxInput.getText().toString())};
    }

    private boolean checkAllInputs() {
        logMsg();
        return checkAgeRange(ageMinInput, ageMaxInput);
    }

    private boolean checkAgeRange(EditText ageMinInput, EditText ageMaxInput) {
        if (TextUtils.isEmpty(ageMaxInput.getText().toString()) || TextUtils.isEmpty(ageMaxInput.getText().toString())) {
            Toast.makeText(this, "Please provide you age range preference", Toast.LENGTH_LONG).show();
            return false;
        } else if (Integer.parseInt(ageMaxInput.getText().toString()) < Integer.parseInt(ageMinInput.getText().toString())) {
            Toast.makeText(this, "Invalid age range input", Toast.LENGTH_LONG).show();
            return false;
        } else if (Integer.parseInt(ageMinInput.getText().toString()) < 18) {
            Toast.makeText(this, "The minimum is 18", Toast.LENGTH_SHORT).show();
            return false;
        }
        return true;
    }

    @SuppressLint("LongLogTag")
    public void logMsg() {
        Log.d(TAG, "addUser: age min input = " + ageMinInput);
        Log.d(TAG, "addUser: age max input = " + ageMaxInput);
        Log.d(TAG, "addUser: male = " + gender);
        Log.d(TAG, "addUser: female = " + location);
    }

    @SuppressLint("LongLogTag")
    @Override
    public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
        if (buttonView.equals(menSwitch)) {
            preferMen = isChecked;
            Log.d(TAG, "onCheckedChanged: buttonView => " + buttonView + " | preferMen => " + preferMen);
        } else if (buttonView.equals(womenSwitch)) {
            preferWomen = isChecked;
            Log.d(TAG, "onCheckedChanged: buttonView => " + buttonView + " | preferMen => " + preferMen);
        }

        setGenderPref();
    }
}
