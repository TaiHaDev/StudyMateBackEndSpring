package com.StudyMate.StudyMate.model;


import jakarta.persistence.*;

@Entity
public class Background {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false)
    private String url;
    @Column(nullable = false)
    private String name;
    @Column(nullable = false)
    private String theme;

    public Background(String URL, String name, String theme) {
        this.url = URL;
        this.name = name;
        this.theme = theme;
    }

    public Background() {
    }


    public String getTheme() {
        return theme;
    }

    public void setTheme(String theme) {
        this.theme = theme;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
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
