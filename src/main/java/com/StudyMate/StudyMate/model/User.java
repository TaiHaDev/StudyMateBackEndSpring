package com.StudyMate.StudyMate.model;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity(name = "User")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", updatable = false)

    private Integer id;

    @Column(name = "name", columnDefinition = "TEXT")
    private String name;

    @Column(name = "subscription", columnDefinition = "TEXT")
    private String subscription;


    @Column(name = "email", nullable = false, columnDefinition = "TEXT")
    private String email;

    @OneToMany (mappedBy = "user", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<FavouriteBackground> userFavouriteBackgrounds = new ArrayList<>();


    public User() {
    }

    public User(Integer id, String name, String subscription, String email, List<FavouriteBackground> userFavouriteBackgrounds) {
        this.id = id;
        this.name = name;
        this.subscription = subscription;
        this.email = email;
        this.userFavouriteBackgrounds = userFavouriteBackgrounds;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSubscription() {
        return subscription;
    }

    public void setSubscription(String subscription) {
        this.subscription = subscription;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<FavouriteBackground> getUserFavouriteBackgrounds() {
        return userFavouriteBackgrounds;
    }

    public void setUserFavouriteBackgrounds(List<FavouriteBackground> userFavouriteBackgrounds) {
        this.userFavouriteBackgrounds = userFavouriteBackgrounds;
    }
}
