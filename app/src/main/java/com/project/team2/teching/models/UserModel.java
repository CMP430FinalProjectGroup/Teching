package com.project.team2.teching.models;

import androidx.annotation.NonNull;

public class UserModel {
    private String username;
    private String email;
    private String password;
    private String profileId;
    private String profilePictureId;

    public UserModel() {
    }

    public UserModel(@NonNull String username, @NonNull String email, @NonNull String password,
                     String profileId, String profilePictureId) {
        this.username = username;
        this.password = password;
        this.profileId = profileId;
        this.profilePictureId = profilePictureId;
    }

    // Setters

    @NonNull
    public String getUsername() {
        return username;
    }

    public void setUsername(@NonNull String username) {
        this.username = username;
    }

    @NonNull
    public String getEmail() {
        return email;
    }

    public void setEmail(@NonNull String email) {
        this.email = email;
    }

    @NonNull
    public String getPassword() {
        return password;
    }

    // Getters

    public void setPassword(@NonNull String password) {
        this.password = password;
    }

    public String getProfileId() {
        return profileId;
    }

    public void setProfileId(String profileId) {
        this.profileId = profileId;
    }

    public String getProfilePictureId() {
        return profilePictureId;
    }

    public void setProfilePictureId(String profilePictureId) {
        this.profilePictureId = profilePictureId;
    }
}

