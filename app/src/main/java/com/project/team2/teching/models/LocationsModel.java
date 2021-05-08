package com.project.team2.teching.models;

import androidx.annotation.NonNull;

public class LocationsModel {

    private String id;
    private String zipCode;
    private String state;
    private String city;

    public LocationsModel(String id, String zipCode, String state, String city) {
        this.id = id;
        this.zipCode = zipCode;
        this.state = state;
        this.city = city;
    }


    //Getters

    @NonNull
    public String getId() {
        return id;
    }

    @NonNull
    public String getZipCode() {
        return zipCode;
    }

    @NonNull
    public String getState() {
        return state;
    }

    @NonNull
    public String getCity() {
        return city;
    }

    //Setters

    public void setId(@NonNull String id) {
        this.id = id;
    }

    public void setZipCode(@NonNull String zipCode) {
        this.zipCode = zipCode;
    }

    public void setState(@NonNull String state) {
        this.state = state;
    }

    public void setCity(@NonNull String city) {
        this.city = city;
    }
}
