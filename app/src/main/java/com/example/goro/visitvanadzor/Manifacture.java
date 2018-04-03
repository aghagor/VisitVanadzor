package com.example.goro.visitvanadzor;

/**
 * Created by Goro on 03.04.2018.
 */

public class Manifacture {
    private String title;
    private int img;
    private double longitude;
    private double langitude;
    private String description;

    public Manifacture(String title, int img, double longitude, double langitude, String description) {
        this.title = title;
        this.img = img;
        this.longitude = longitude;
        this.langitude = langitude;
        this.description = description;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getImg() {
        return img;
    }

    public void setImg(int img) {
        this.img = img;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    public double getLangitude() {
        return langitude;
    }

    public void setLangitude(double langitude) {
        this.langitude = langitude;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
