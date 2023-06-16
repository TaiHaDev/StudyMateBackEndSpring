package com.StudyMate.StudyMate.model;

public class Favourite_background {
    private Integer userID;
    private String backgroundID;

    public Favourite_background() {
    }

    public Favourite_background(Integer userID, String backgroundID) {
        this.userID = userID;
        this.backgroundID = backgroundID;
    }

    public Integer getUserID() {
        return userID;
    }

    public void setUserID(Integer userID) {
        this.userID = userID;
    }

    public String getBackgroundID() {
        return backgroundID;
    }

    public void setBackgroundID(String backgroundID) {
        this.backgroundID = backgroundID;
    }
}
