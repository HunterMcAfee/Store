package com.company;

import java.util.ArrayList;

public class Cart {

    ArrayList<Product> list = new ArrayList<Product>();

    public void viewCart() {
        for (Product pro : list)
            System.out.println(pro.toString());
    }

    public void addItem(Product pro) {
        list.add(pro);
    }

    public void removeItem(Product pro) {
        list.remove(pro);
    }


}