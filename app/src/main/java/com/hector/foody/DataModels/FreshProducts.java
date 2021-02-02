package com.hector.foody.DataModels;

public class FreshProducts {
    String product_id, name, description, model, quantity, sku, vsn, tax, stock_status, image, delivery_charge, manufacturer_id, manufacturer, price, discount, date_available, sort_order, status;

    public FreshProducts() {
    }

    public FreshProducts(String product_id, String name, String description, String model, String quantity, String sku, String vsn, String tax, String stock_status, String image, String delivery_charge, String manufacturer_id, String manufacturer, String price, String discount, String date_available, String sort_order, String status) {
        this.product_id = product_id;
        this.name = name;
        this.description = description;
        this.model = model;
        this.quantity = quantity;
        this.sku = sku;
        this.vsn = vsn;
        this.tax = tax;
        this.stock_status = stock_status;
        this.image = image;
        this.delivery_charge = delivery_charge;
        this.manufacturer_id = manufacturer_id;
        this.manufacturer = manufacturer;
        this.price = price;
        this.discount = discount;
        this.date_available = date_available;
        this.sort_order = sort_order;
        this.status = status;
    }

    public String getProduct_id() {
        return product_id;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public String getModel() {
        return model;
    }

    public String getQuantity() {
        return quantity;
    }

    public String getSku() {
        return sku;
    }

    public String getVsn() {
        return vsn;
    }

    public String getTax() {
        return tax;
    }

    public String getStock_status() {
        return stock_status;
    }

    public String getImage() {
        return image;
    }

    public String getDelivery_charge() {
        return delivery_charge;
    }

    public String getManufacturer_id() {
        return manufacturer_id;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public String getPrice() {
        return price;
    }

    public String getDiscount() {
        return discount;
    }

    public String getDate_available() {
        return date_available;
    }

    public String getSort_order() {
        return sort_order;
    }

    public String getStatus() {
        return status;
    }
}
