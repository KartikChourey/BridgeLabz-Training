package com.generics.dynamiconlinemarketplace;

public class OnlineMarket {
    public static void main(String[] args) {

        Product<BookCategory> book = new Product<>("Java Book", 500);
        Product<GadgetCategory> phone = new Product<>("Smartphone", 20000);

        DiscountUtil.applyDiscount(book, 10);
        DiscountUtil.applyDiscount(phone, 5);

        System.out.println(book.name + " Price: " + book.price);
        System.out.println(phone.name + " Price: " + phone.price);
    }
}