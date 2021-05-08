package com.project.team2.teching.models;

import androidx.annotation.NonNull;

public class ProfileModel {

    private String id;
    private String Name;
    private String DateOfBirth;
    private String Gender;
    private String locationId;
    private String genderPref;
    private String userId;
    private String bio;

    public ProfileModel(String id, String name, String dateOfBirth, String gender, String locationId, String genderPref, String userId, String bio) {
        this.id = id;
        Name = name;
        DateOfBirth = dateOfBirth;
        Gender = gender;
        this.locationId = locationId;
        this.genderPref = genderPref;
        this.userId = userId;
        this.bio = bio;
    }

    //Getters

    @NonNull
    public String getId() {
        return id;
    }

    @NonNull
    public String getName() {
        return Name;
    }

    @NonNull
    public String getDateOfBirth() {
        return DateOfBirth;
    }

    @NonNull
    public String getGender() {
        return Gender;
    }

    @NonNull
    public String getLocationId() {
        return locationId;
    }

    @NonNull
    public String getGenderPref() {
        return genderPref;
    }

    @NonNull
    public String getUserId() {
        return userId;
    }

    @NonNull
    public String getBio() {
        return bio;
    }

    //Setters

    public void setId(@NonNull String id) {
        this.id = id;
    }

    public void setName(@NonNull String name) {
        Name = name;
    }

    public void setDateOfBirth(@NonNull String dateOfBirth) {
        DateOfBirth = dateOfBirth;
    }

    public void setGender(@NonNull String gender) {
        Gender = gender;
    }

    public void setLocationId(@NonNull String locationId) {
        this.locationId = locationId;
    }

    public void setGenderPref(@NonNull String genderPref) {
        this.genderPref = genderPref;
    }

    public void setUserId(@NonNull String userId) {
        this.userId = userId;
    }

    public void setBio(@NonNull String bio) {
        this.bio = bio;
    }




}
