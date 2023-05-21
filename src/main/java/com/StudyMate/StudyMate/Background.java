package com.StudyMate.StudyMate;

public class Background {
    private Integer id;
    private String URL;
    private String name;

    public Background() {
    }

    public Background(Integer id, String URL, String name) {
        this.id = id;
        this.URL = URL;
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getURL() {
        return URL;
    }

    public void setURL(String URL) {
        this.URL = URL;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
