package com.project.team2.teching.models;

import androidx.annotation.NonNull;

public class ChatModel {

    private String id;

    public ChatModel(String id) {
        this.id = id;
    }

    //Getters

    @NonNull
    public String getId() {
        return id;
    }

    //Setters

    public void setId(@NonNull String id) {
        this.id = id;
    }
}
