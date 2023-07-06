package com.StudyMate.StudyMate.model;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

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

    private String password;
    @ElementCollection(fetch = FetchType.EAGER)
    private List<GrantedAuthority> authorities = new ArrayList<>();





    @OneToMany (mappedBy = "user", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<FavouriteBackground> userFavouriteBackgrounds = new ArrayList<>();

    public UserDetails asUser() {
        return new org.springframework.security.core.userdetails.User(email, password, authorities);
    }
    public User(Integer id, String subscription, String first_name, String last_name, String email) {
        this.id = id;
        this.subscription = subscription;
        this.first_name = first_name;
        this.last_name = last_name;
        this.email = email;
    }

    public User() {

    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public List<GrantedAuthority> getAuthorities() {
        return authorities;
    }

    public void setAuthorities(String... authorities) {
        this.authorities = Arrays.stream(authorities).map(authority -> new SimpleGrantedAuthority(authority)).collect(Collectors.toList());
    }

    public List<FavouriteBackground> getUserFavouriteBackgrounds() {
        return userFavouriteBackgrounds;
    }

    public void setUserFavouriteBackgrounds(List<FavouriteBackground> userFavouriteBackgrounds) {
        this.userFavouriteBackgrounds = userFavouriteBackgrounds;
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
