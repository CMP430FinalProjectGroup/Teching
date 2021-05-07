package com.project.team2.teching;

import androidx.annotation.NonNull;

public class LocationsModel {

    private String iD;
    private String zipcode;
    private String state;
    private String city;

    public LocationsModel(String iD, String zipcode, String state, String city) {
        this.iD = iD;
        this.zipcode = zipcode;
        this.state = state;
        this.city = city;
    }


    //Getters

    @NonNull
    public String getiD() {
        return iD;
    }

    @NonNull
    public String getZipcode() {
        return zipcode;
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

    public void setiD(@NonNull String iD) {
        this.iD = iD;
    }

    public void setZipcode(@NonNull String zipcode) {
        this.zipcode = zipcode;
    }

    public void setState(@NonNull String state) {
        this.state = state;
    }

    public void setCity(@NonNull String city) {
        this.city = city;
    }
}
