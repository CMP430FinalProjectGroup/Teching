package com.project.team2.teching;

import androidx.annotation.NonNull;

public class FriendListModel {
    private String userId;
    private String friendId;


    public FriendListModel(String userId, String friendId) {
        this.userId = userId;
        this.friendId = friendId;
    }

    //Getters

    @NonNull
    public String getUserId() {
        return userId;
    }

    @NonNull
    public String getFriendId() {
        return friendId;
    }


    //Setters

    public void setUserId(@NonNull String userId) {
        this.userId = userId;
    }

    public void setFriendId(@NonNull String friendId) {
        this.friendId = friendId;
    }
}
