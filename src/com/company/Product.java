package com.company;


public class Product {

    private String name;
    private String description;
    private double price;
    private int quantity;
    private Boolean availability;

    private Product() {
    }

    public Product(String name, String description, double price, int quantity, Boolean availability) {
        this.name = name;
        this.description = description;
        this.price = price;
        this.quantity = quantity;
        this.availability = availability;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return this.price;
    }

    public void setPrice(double price) {
        this.price = price;
    }


    public int getQuantity() {
        return this.quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String toString() {
        return "Item name: " + this.name + ", Item price: " + this.price;
    }

    public void setAvailability(Boolean avail) {
        this.availability = avail;
    }

    public Boolean getAvailability() {
        return availability;
    }
}
