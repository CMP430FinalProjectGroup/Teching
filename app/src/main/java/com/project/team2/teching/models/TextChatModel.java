package com.project.team2.teching.models;

import androidx.annotation.NonNull;

public class TextChatModel {

    private String id;
    private String messages;
    private String chatId;


    public TextChatModel(String id, String messages, String chatId) {
        this.id = id;
        this.messages = messages;
        this.chatId = chatId;
    }

    //Getters

    @NonNull
    public String getId() {
        return id;
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

    public void setId(@NonNull String id) {
        this.id = id;
    }

    public void setMessages(@NonNull String messages) {
        this.messages = messages;
    }

    public void setChatId(@NonNull String chatId) {
        this.chatId = chatId;
    }
}
