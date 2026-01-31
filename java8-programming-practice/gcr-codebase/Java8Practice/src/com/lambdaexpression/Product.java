package com.lambdaexpression;

import java.util.*;

public class Product {
    String name;
    double price;
    double rating;
    int discount;

    Product(String name, double price, double rating, int discount) {
        this.name = name;
        this.price = price;
        this.rating = rating;
        this.discount = discount;
    }
}

 class ProductSort {
    public static void main(String[] args) {

        List<Product> products = new ArrayList<>();
        products.add(new Product("Phone", 50000, 4.5, 10));
        products.add(new Product("Laptop", 80000, 4.7, 15));
        products.add(new Product("Headphones", 3000, 4.2, 5));

        products.sort((p1, p2) -> Double.compare(p1.price, p2.price));

  
        products.sort((p1, p2) -> Double.compare(p2.rating, p1.rating));

    
        products.sort((p1, p2) -> p2.discount - p1.discount);

        products.forEach(p -> System.out.println(p.name));
    }
}
