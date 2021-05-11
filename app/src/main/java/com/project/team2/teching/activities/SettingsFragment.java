package com.project.team2.teching.activities;

import android.os.Bundle;

import androidx.preference.PreferenceFragmentCompat;

import com.project.team2.teching.R;

public class SettingsFragment extends PreferenceFragmentCompat {

    @Override
    public void onCreatePreferences(Bundle savedInstanceState, String rootKey) {
        setPreferencesFromResource(R.xml.root_preferences, rootKey);
    }
}