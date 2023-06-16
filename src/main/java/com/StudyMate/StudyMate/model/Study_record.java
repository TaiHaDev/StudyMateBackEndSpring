package com.StudyMate.StudyMate.model;

import java.sql.Time;

public class Study_record {
    private Long id;
    private Time date;
    private double study_time;
    private Integer userID;

    public Study_record() {
    }

    public Study_record(Long id, Time date, double study_time, Integer userID) {
        this.id = id;
        this.date = date;
        this.study_time = study_time;
        this.userID = userID;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Time getDate() {
        return date;
    }

    public void setDate(Time date) {
        this.date = date;
    }

    public double getStudy_time() {
        return study_time;
    }

    public void setStudy_time(double study_time) {
        this.study_time = study_time;
    }

    public Integer getUserID() {
        return userID;
    }

    public void setUserID(Integer userID) {
        this.userID = userID;
    }
}
