package com.project.team2.teching.models;

import androidx.annotation.NonNull;

public class UserModel {
    private String username;
    private String email;
    private String password;
    private String profileId;
    private String profilePictureId;

    // Setters


    public void setUsername(@NonNull String username) {
        this.username = username;
    }

    public void setEmail(@NonNull String email) {
        this.email = email;
    }

    public void setPassword(@NonNull String password) {
        this.password = password;
    }

    public void setProfileId(String profileId) {
        this.profileId = profileId;
    }

    public void setProfilePictureId(String profilePictureId) {
        this.profilePictureId = profilePictureId;
    }

    // Getters

    @NonNull
    public String getUsername() {
        return username;
    }

    @NonNull
    public String getEmail() {
        return email;
    }

    @NonNull
    public String getPassword() {
        return password;
    }

    public String getProfileId() {
        return profileId;
    }

    public String getProfilePictureId() {
        return profilePictureId;
    }
}

