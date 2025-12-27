package com.constructor.level1;

public class Product {
    String productName;       // belongs to each product
    double price;
    static int totalProducts = 0;  // shared by all objects

    Product(String productName, double price) {
        this.productName = productName;
        this.price = price;
        totalProducts++;  // count increases when object is created
    }

    void showProduct() {
        System.out.println(productName + " - ₹" + price);
    }

    // static method to access static variable
    static void showTotalProducts() {
        System.out.println("Total Products: " + totalProducts);
    }
}

