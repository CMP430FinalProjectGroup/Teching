package com.project.team2.teching;

import androidx.annotation.NonNull;

public class TextChatModel {

    private String iD;
    private String messages;
    private String chatId;


    public TextChatModel(String iD, String messages, String chatId) {
        this.iD = iD;
        this.messages = messages;
        this.chatId = chatId;
    }

    //Getters

    @NonNull
    public String getiD() {
        return iD;
    }

    @NonNull
    public String getMessages() {
        return messages;
    }

    @NonNull
    public String getChatId() {
        return chatId;
    }

    //Setters

    public void setiD(@NonNull String iD) {
        this.iD = iD;
    }

    public void setMessages(@NonNull String messages) {
        this.messages = messages;
    }

    public void setChatId(@NonNull String chatId) {
        this.chatId = chatId;
    }
}
