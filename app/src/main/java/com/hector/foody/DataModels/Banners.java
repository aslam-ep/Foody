package com.hector.foody.DataModels;

public class Banners {
    String name, image, title;

    public Banners() {
    }

    public Banners(String name, String image, String title) {
        this.name = name;
        this.image = image;
        this.title = title;
    }

    public String getName() {
        return name;
    }

    public String getImage() {
        return image;
    }

    public String getTitle() {
        return title;
    }
}
