package com.StudyMate.StudyMate.model;

public class Subscription {
    private Integer id;
    private Integer userID;
    private String type;
    private String period;

    public Subscription() {
    }

    public Subscription(Integer id, Integer userID, String type, String period) {
        this.id = id;
        this.userID = userID;
        this.type = type;
        this.period = period;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUserID() {
        return userID;
    }

    public void setUserID(Integer userID) {
        this.userID = userID;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getPeriod() {
        return period;
    }

    public void setPeriod(String period) {
        this.period = period;
    }
}
