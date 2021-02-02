package com.hector.foody.DataModels;

import java.util.ArrayList;

public class FetechedData {

    ArrayList<Banners> banners;
    ArrayList<Categories> categories;
    ArrayList<FreshProducts> fresh_products, ProductsForYou;

    public FetechedData() {
    }

    public FetechedData(ArrayList<Banners> banners, ArrayList<Categories> categories, ArrayList<FreshProducts> fresh_products, ArrayList<FreshProducts> productsForYou) {
        this.banners = banners;
        this.categories = categories;
        this.fresh_products = fresh_products;
        ProductsForYou = productsForYou;
    }

    public ArrayList<Banners> getBanners() {
        return banners;
    }

    public ArrayList<Categories> getCategories() {
        return categories;
    }

    public ArrayList<FreshProducts> getFresh_products() {
        return fresh_products;
    }

    public ArrayList<FreshProducts> getProductsForYou() {
        return ProductsForYou;
    }
}
