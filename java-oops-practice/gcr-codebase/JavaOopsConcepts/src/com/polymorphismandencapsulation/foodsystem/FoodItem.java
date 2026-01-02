package com.polymorphismandencapsulation.foodsystem; 

// Discount interface
interface Discountable {
    double applyDiscount();
    String getDiscountDetails();
}

// Abstract food item
abstract class FoodItem {

    protected String itemName;
    protected double price;
    protected int quantity;

    FoodItem(String itemName, double price, int quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }

    abstract double calculateTotalPrice();
}