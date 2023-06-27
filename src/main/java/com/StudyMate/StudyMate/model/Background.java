package com.StudyMate.StudyMate.model;


import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity(name = "Background")
public class Background {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(nullable = false)
    private String url;
    @Column(nullable = false)
    private String name;
    @Column(nullable = false)
    private String theme;
    @Column(nullable = false)
    private String pictureURL;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "background")
    @JsonManagedReference
    private List<FavouriteBackground> userFavouriteBackgrounds = new ArrayList<>();

    public Background(String URL, String name, String theme) {
        this.url = URL;
        this.name = name;
        this.theme = theme;
    }

    public Background() {
    }

    public Background(Integer id, String url, String name, String theme, String pictureURL, List<FavouriteBackground> userFavouriteBackgrounds) {
        this.id = id;
        this.url = url;
        this.name = name;
        this.theme = theme;
        this.pictureURL = pictureURL;
        this.userFavouriteBackgrounds = userFavouriteBackgrounds;
    }

    public String getPictureURL() {
        return pictureURL;
    }

    public void setPictureURL(String pictureURL) {
        this.pictureURL = pictureURL;
    }

    public List<FavouriteBackground> getUserFavouriteBackgrounds() {
        return userFavouriteBackgrounds;
    }

    public void setUserFavouriteBackgrounds(List<FavouriteBackground> userFavouriteBackgrounds) {
        this.userFavouriteBackgrounds = userFavouriteBackgrounds;
    }

    public String getTheme() {
        return theme;
    }

    public void setTheme(String theme) {
        this.theme = theme;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String URL) {
        this.url = URL;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Background{" +
                "id=" + id +
                ", URL='" + url + '\'' +
                ", name='" + name + '\'' +
                ", theme='" + theme + '\'' +
                '}';
    }
}
