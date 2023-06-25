package com.StudyMate.StudyMate.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.FetchType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

public class Favourite_background {
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "userID")
    @JsonBackReference
    private Integer userID;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "backgroundID")
    @JsonBackReference
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
