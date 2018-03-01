package com.company;

import java.util.ArrayList;

public class Vendor {
    private String name;
    private ArrayList<Product> products = new ArrayList<Product>();

    private Vendor() {}

    public Vendor(String name) {
        this.name = name;
    }

    public void getProducts() {
        for (Product product: this.products) {
            if (product.getAvailability() == true)
                System.out.println(product.toString());
        }
    }

    public void addProduct(Product product) {
        this.products.add(product);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}