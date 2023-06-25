package com.StudyMate.StudyMate.model;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;

import java.util.List;

@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String subscription;
    private String name;
    private String email;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "favourite_background")
    @JsonManagedReference
    private List<User> userFavouriteBackgrounds;

    public User() {
    }

    public List<User> getUserFavouriteBackgrounds(){
        return userFavouriteBackgrounds;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getSubscription() {
        return subscription;
    }

    public void setSubscription(String subscription) {
        this.subscription = subscription;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
