package com.company;

import java.util.Scanner;

public class Main {

    static Cart cart = new Cart();

    static Vendor vendor1 = new Vendor("One");
    static Vendor target = new Vendor("Target");
    static Vendor goodWill = new Vendor("goodWill");

    public static void main(String[] args) {
        // write your code here
        Scanner in = new Scanner(System.in);

        Product soap = new Product("Soap","One bar of soap",1.50d,10,true);
        Product broom = new Product("Broom","One bristle broom",9.50d,10,false);
        Product bucket = new Product("Bucket","One metal bucket",12d,10,true);
        Product cup = new Product("Cup", "10 pack of cups", 4d,10,false);
        Product phone = new Product("Phone","one landline phone",40d,10,true);

        Product marker = new Product("Marker","Magic Marker",3d,12,false);
        Product pen = new Product("Pen","12 ball point pens",6.5d,15,true);
        Product pencil = new Product("Pencil","number 2 pencil, 10 pack",5.45d,13,false);
        Product table = new Product("Table","one folding table",45.5d,5,true);
        Product chair = new Product("Chair","one folding chair",19.99d,9,false);

        Product shirt = new Product("Shirt","button up shirt",7.49d, 14,true);
        Product pants = new Product("Pants", "old Dockers",8.24d,12,false);
        Product belt = new Product("Belt","brown leather belt",4.87d,6,true);
        Product shoes = new Product("Shoes","beat up sperrys",8d,11,false);
        Product hat = new Product("Hat","90s revival bucket hat",6.45d, 1,true);



        vendor1.addProduct(soap);
        vendor1.addProduct(broom);
        vendor1.addProduct(bucket);
        vendor1.addProduct(phone);
        vendor1.addProduct(cup);

        target.addProduct(marker);
        target.addProduct(pen);
        target.addProduct(pencil);
        target.addProduct(chair);
        target.addProduct(table);

        goodWill.addProduct(shirt);
        goodWill.addProduct(belt);
        goodWill.addProduct(pants);
        goodWill.addProduct(shoes);
        goodWill.addProduct(hat);

        inventory();






    }

    public static void inventory() {
        vendor1.getProducts();
        target.getProducts();
        goodWill.getProducts();
        System.out.println("END OF INVENTORY \n");
    }

    public static void viewCart() {
        cart.viewCart();
        System.out.println("END OF CART");
    }

    public static void cartAdd(Product pro) {
        cart.addItem(pro);
    }

    public static void cartRemove(Product pro) {
        cart.removeItem(pro);
    }

    public static void checkout() {
        double total = 0d;

        for (Product pro : cart.getList()) {
            System.out.println(pro.toString());
            total += pro.getPrice();
        }

        System.out.println("Total: " + total);
    }
}