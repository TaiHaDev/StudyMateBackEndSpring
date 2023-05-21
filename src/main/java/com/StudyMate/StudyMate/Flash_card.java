package com.StudyMate.StudyMate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Flash_card {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private Integer setID;
    private String content;
    private String date;

    public Flash_card() {
    }

    public Flash_card(Integer id, Integer setID, String content, String date) {
        this.id = id;
        this.setID = setID;
        this.content = content;
        this.date = date;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getSetID() {
        return setID;
    }

    public void setSetID(Integer setID) {
        this.setID = setID;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}
