package com.project.team2.teching;

import androidx.annotation.NonNull;

public class ProfileModel {

    private String iD;
    private String Name;
    private String DateofBirth;
    private String Gender;
    private String locationId;
    private String genderPref;
    private String userId;
    private String bio;

    public ProfileModel(String iD, String name, String dateofBirth, String gender, String locationId, String genderPref, String userId, String bio) {
        this.iD = iD;
        Name = name;
        DateofBirth = dateofBirth;
        Gender = gender;
        this.locationId = locationId;
        this.genderPref = genderPref;
        this.userId = userId;
        this.bio = bio;
    }

    //Getters

    @NonNull
    public String getiD() {
        return iD;
    }

    @NonNull
    public String getName() {
        return Name;
    }

    @NonNull
    public String getDateofBirth() {
        return DateofBirth;
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

    public void setiD(@NonNull String iD) {
        this.iD = iD;
    }

    public void setName(@NonNull String name) {
        Name = name;
    }

    public void setDateofBirth(@NonNull String dateofBirth) {
        DateofBirth = dateofBirth;
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
