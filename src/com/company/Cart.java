package com.company;

import java.util.ArrayList;

public class Cart {

    private ArrayList<Product> list = new ArrayList<Product>();

    public Cart() {}

    public void viewCart() {
        for (Product pro : this.list)
            System.out.println(pro.toString());
    }

    public void addItem(Product pro) {
        if (pro.getQuantity() > 0)
            list.add(pro);
        else
            System.out.println("Item is out of stock.");
    }

    public void removeItem(Product pro) {
        list.remove(pro);
    }

    public ArrayList<Product> getList() {
        return list;
    }


}
