package com.functionalinterface;

interface PaymentProcessor {
    void processPayment(double amount);

    default void refund(double amount) {
        System.out.println("Refunded ₹" + amount);
    }
}

class Razorpay implements PaymentProcessor {
    public void processPayment(double amount) {
        System.out.println("Payment of ₹" + amount + " processed");
    }
}

public class PaymentGateway {
    public static void main(String[] args) {

        PaymentProcessor p = new Razorpay();
        p.processPayment(2000);
        p.refund(500);
    }
}
