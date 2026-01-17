package com.generics.dynamiconlinemarketplace;

class Product<T extends Category> {
    String name;
    double price;

    Product(String name, double price) {
        this.name = name;
        this.price = price;
    }
}
