package com.project.team2.teching.models;

import androidx.annotation.NonNull;

public class ResourcesModel {

    private String id;
    private String title;
    private String chatId;


    public ResourcesModel(String id, String title, String chatId) {
        this.id = id;
        this.title = title;
        this.chatId = chatId;
    }


    //Getters

    @NonNull
    public String getId() {
        return id;
    }

    @NonNull
    public String getTitle() {
        return title;
    }

    @NonNull
    public String getChatId() {
        return chatId;
    }

    //Setters

    public void setId(@NonNull String id) {
        this.id = id;
    }

    public void setTitle(@NonNull String title) {
        this.title = title;
    }

    public void setChatId(@NonNull String chatId) {
        this.chatId = chatId;
    }
}
