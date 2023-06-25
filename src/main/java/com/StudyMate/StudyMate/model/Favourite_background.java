package com.StudyMate.StudyMate.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
@Entity
public class Favourite_background {
    @Id
    private Integer userID;
    @Id
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
