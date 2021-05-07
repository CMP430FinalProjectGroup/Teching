package com.project.team2.teching;

import androidx.annotation.NonNull;

public class ResourcesModel {

    private String iD;
    private String title;
    private String chatId;


    public ResourcesModel(String iD, String title, String chatId) {
        this.iD = iD;
        this.title = title;
        this.chatId = chatId;
    }


    //Getters

    @NonNull
    public String getiD() {
        return iD;
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

    public void setiD(@NonNull String iD) {
        this.iD = iD;
    }

    public void setTitle(@NonNull String title) {
        this.title = title;
    }

    public void setChatId(@NonNull String chatId) {
        this.chatId = chatId;
    }
}
