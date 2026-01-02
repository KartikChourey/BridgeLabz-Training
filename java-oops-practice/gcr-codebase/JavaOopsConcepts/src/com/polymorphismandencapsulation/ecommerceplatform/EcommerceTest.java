package com.polymorphismandencapsulation.ecommerceplatform;
import java.util.ArrayList;

// Main
public class EcommerceTest {

    static void printFinalPrice(Product p) {
        double tax = (p instanceof Taxable) ? ((Taxable) p).calculateTax() : 0;
        double finalPrice = p.getPrice() + tax - p.calculateDiscount();
        System.out.println("Final Price: ₹" + finalPrice);
    }

    public static void main(String[] args) {

        ArrayList<Product> products = new ArrayList<>();
        products.add(new Electronics(101, "Laptop", 60000));
        products.add(new Clothing(102, "Jacket", 3000));

        for (Product p : products) {
            printFinalPrice(p);
        }
    }
}