package com.company;

import java.util.ArrayList;

public class Vendor {
    private String name;
    private ArrayList<Product> availableProducts;
    private ArrayList<Product> unavailableProducts;
    
    private Vendor() {}

    public Vendor(String name, ArrayList<Product> availableProducts, ArrayList<Product> unavailableProducts) {
        this.name = name;
        this.availableProducts = availableProducts;
        this.unavailableProducts = unavailableProducts;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Product> getAvailableProducts() {
        return availableProducts;
    }

    public void setAvailableProducts(ArrayList<Product> availableProducts) {
        this.availableProducts = availableProducts;
    }

    public ArrayList<Product> getUnavailableProducts() {
        return unavailableProducts;
    }

    public void setUnavailableProducts(ArrayList<Product> unavailableProducts) {
        this.unavailableProducts = unavailableProducts;
    }
}
