package com.project.team2.teching.activities;

public class User {

    // Member variables representing the title and information about the sport.
    private String name;
    private final int imageResource;
    private String bio;

    public User(String title,  int imageResource ,String bio) {
        this.name = title;
        this.imageResource = imageResource;
        this.bio=bio;
    }
    public String getName() {
        return name;
    }

    public int getImageResource() {
        return imageResource;
    }

    public String getBio() {
        return bio;
    }
}