package com.inheritance.multipleinheritance.onlinesystem;

public class OrderTest {

    public static void main(String[] args) {

        DeliveredOrder order =
                new DeliveredOrder(501, "12-08-2025", "TRK78945", "15-08-2025");

        System.out.println("Order Status: " + order.getOrderStatus());
    }
}