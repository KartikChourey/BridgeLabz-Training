package com.polymorphismandencapsulation.ecommerceplatform;
import java.util.ArrayList;

// Clothing product
class Clothing extends Product {

    Clothing(int id, String name, double price) {
        super(id, name, price);
    }

    double calculateDiscount() {
        return getPrice() * 0.20;
    }
}