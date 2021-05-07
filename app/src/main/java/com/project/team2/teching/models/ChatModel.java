package com.project.team2.teching;

import androidx.annotation.NonNull;

public class ChatModel {

    private String iD;

    public ChatModel(String iD) {
        this.iD = iD;
    }

    //Getters

    @NonNull
    public String getiD() {
        return iD;
    }

    //Setters

    public void setiD(@NonNull String iD) {
        this.iD = iD;
    }
}
