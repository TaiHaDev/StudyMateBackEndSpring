package com.StudyMate.StudyMate.model;

public class Subscription {
    private Long id;
    private Integer userID;
    private String type;
    private String period;

    public Subscription() {
    }

    public Subscription(Long id, Integer userID, String type, String period) {
        this.id = id;
        this.userID = userID;
        this.type = type;
        this.period = period;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
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
