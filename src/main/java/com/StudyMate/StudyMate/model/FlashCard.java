package com.StudyMate.StudyMate.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
@Entity(name = "FlashCard")
public class FlashCard {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "setID")
    @JsonBackReference
    private FlashCardSet flashCardSet;
    private String front;
    private String back;
    private String date;

    public FlashCard() {
    }

    public FlashCard(Integer id, String front, String back) {
        this.id = id;
        this.front = front;
        this.back = back;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public FlashCardSet getFlashCardSet() {
        return flashCardSet;
    }

    public void setFlashCardSet(FlashCardSet flashCardSet) {
        this.flashCardSet = flashCardSet;
    }

    public String getFront() {
        return front;
    }

    public void setFront(String front) {
        this.front = front;
    }

    public String getBack() {
        return back;
    }

    public void setBack(String back) {
        this.back = back;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}
