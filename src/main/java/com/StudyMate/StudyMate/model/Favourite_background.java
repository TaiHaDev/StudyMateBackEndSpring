package com.StudyMate.StudyMate.model;

public class Favourite_background {
    private Long userID;
    private String backgroundID;

    public Favourite_background() {
    }

    public Favourite_background(Long userID, String backgroundID) {
        this.userID = userID;
        this.backgroundID = backgroundID;
    }

    public Long getUserID() {
        return userID;
    }

    public void setUserID(Long userID) {
        this.userID = userID;
    }

    public String getBackgroundID() {
        return backgroundID;
    }

    public void setBackgroundID(String backgroundID) {
        this.backgroundID = backgroundID;
    }
}
