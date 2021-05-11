package com.project.team2.teching.models;

import androidx.annotation.NonNull;

public class ProfileModel {

    private String id;
    private String name;
    private String dateOfBirth;
    private String gender;
    private String location;
    private boolean[] genderPref;
    private String userId;
    private String bio;
    private int[] ageRange;

    public ProfileModel() {
    }

    public ProfileModel(String id, String name, String dateOfBirth, String gender, String location,
                        boolean[] genderPref, String userId, String bio, int[] ageRange) {
        this.id = id;
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.gender = gender;
        this.location = location;
        this.genderPref = genderPref;
        this.userId = userId;
        this.bio = bio;
        this.ageRange = ageRange;
    }

    //Getters

    @NonNull
    public String getId() {
        return id;
    }

    public void setId(@NonNull String id) {
        this.id = id;
    }

    @NonNull
    public String getName() {
        return name;
    }

    public void setName(@NonNull String name) {
        this.name = name;
    }

    @NonNull
    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(@NonNull String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    @NonNull
    public String getGender() {
        return gender;
    }

    public void setGender(@NonNull String gender) {
        this.gender = gender;
    }

    public int[] getAgeRange() {
        return ageRange;
    }

    //Setters

    @NonNull
    public String getLocation() {
        return location;
    }

    public void setLocation(@NonNull String locationId) {
        this.location = locationId;
    }

    @NonNull
    public boolean[] getGenderPref() {
        return genderPref;
    }

    public void setGenderPref(@NonNull boolean[] genderPref) {
        this.genderPref = genderPref;
    }

    @NonNull
    public String getUserId() {
        return userId;
    }

    public void setUserId(@NonNull String userId) {
        this.userId = userId;
    }

    @NonNull
    public String getBio() {
        return bio;
    }

    public void setBio(@NonNull String bio) {
        this.bio = bio;
    }

    public void setAgeRange(int[] ageRange) {
        this.ageRange = ageRange;
    }
}
