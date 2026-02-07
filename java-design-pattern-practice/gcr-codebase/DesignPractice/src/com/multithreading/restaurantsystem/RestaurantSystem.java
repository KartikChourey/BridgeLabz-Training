package com.multithreading.restaurantsystem;

public class RestaurantSystem {
    public static void main(String[] args) throws Exception {
        chef c1 = new chef("Chef-1", "Pizza", 3000);
        chef c2 = new chef("Chef-2", "Pasta", 2000);
        chef c3 = new chef("Chef-3", "Salad", 1000);
        chef c4 = new chef("Chef-4", "Burger", 2500);

        c1.start();
        c2.start();
        c3.start();
        c4.start();

        c1.join();
        c2.join();
        c3.join();
        c4.join();

        System.out.println("All orders completed");
    }
}
