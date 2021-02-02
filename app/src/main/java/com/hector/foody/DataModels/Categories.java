package com.hector.foody.DataModels;

public class Categories {
    String category_id, name, image, parent_id, top;

    public Categories() {
    }

    public Categories(String category_id, String name, String image, String parent_id, String top) {
        this.category_id = category_id;
        this.name = name;
        this.image = image;
        this.parent_id = parent_id;
        this.top = top;
    }

    public String getCategory_id() {
        return category_id;
    }

    public String getName() {
        return name;
    }

    public String getImage() {
        return image;
    }

    public String getParent_id() {
        return parent_id;
    }

    public String getTop() {
        return top;
    }
}
