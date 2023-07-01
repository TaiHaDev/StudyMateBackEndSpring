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

    @Column(name = "subscription", columnDefinition = "TEXT")
    private String subscription;

    @Column(name = "first_name", nullable = false, columnDefinition = "TEXT")
    private String first_name;

    @Column(name = "last_name", nullable = false, columnDefinition = "TEXT")
    private String last_name;

    @Column(name = "email", nullable = false, columnDefinition = "TEXT")
    private String email;

    @OneToMany (mappedBy = "user", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<FavouriteBackground> userFavouriteBackgrounds = new ArrayList<>();


    public User(Integer id, String subscription, String first_name, String last_name, String email) {
        this.id = id;
        this.subscription = subscription;
        this.first_name = first_name;
        this.last_name = last_name;
        this.email = email;
    }

    public User() {

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

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
