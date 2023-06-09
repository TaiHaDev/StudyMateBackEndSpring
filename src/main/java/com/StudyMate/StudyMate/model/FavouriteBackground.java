package com.StudyMate.StudyMate.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;

@Entity(name = "FavouriteBackground")
public class FavouriteBackground {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "userID")
    @JsonBackReference
    @JsonIgnore
    private User user;

    @ManyToOne()
    @JoinColumn(name = "backgroundID", nullable = false)
    @JsonManagedReference
    private Background background;

    public FavouriteBackground() {
    }

    public FavouriteBackground(Integer id, User user, Background background) {
        this.id = id;
        this.user = user;
        this.background = background;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Background getBackground() {
        return background;
    }

    public void setBackground(Background background) {
        this.background = background;
    }


}
