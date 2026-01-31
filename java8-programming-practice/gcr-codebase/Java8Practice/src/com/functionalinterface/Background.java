package com.functionalinterface;

public class Background {
    public static void main(String[] args) {

        Runnable job = () -> System.out.println("Background job executed");

        Thread t = new Thread(job);
        t.start();
    }
}
