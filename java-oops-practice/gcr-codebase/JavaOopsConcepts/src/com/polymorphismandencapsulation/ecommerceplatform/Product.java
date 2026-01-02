package com.polymorphismandencapsulation.ecommerceplatform;

import java.util.ArrayList;

// Tax interface
interface Taxable {
    double calculateTax();
    String getTaxDetails();
}

// Abstract product class
abstract class Product {

    private int productId;
    private String name;
    private double price;

    Product(int productId, String name, double price) {
        this.productId = productId;
        this.name = name;
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    abstract double calculateDiscount();
}