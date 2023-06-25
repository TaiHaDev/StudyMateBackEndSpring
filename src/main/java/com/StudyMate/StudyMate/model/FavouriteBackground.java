package com.StudyMate.StudyMate.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
@Entity
public class FavouriteBackground {
    @Id
    private Integer userID;
    @Id
    private String backgroundID;

    public FavouriteBackground() {
    }

    public FavouriteBackground(Integer userID, String backgroundID) {
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
