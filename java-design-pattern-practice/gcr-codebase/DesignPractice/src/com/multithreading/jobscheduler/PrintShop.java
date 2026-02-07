package com.multithreading.jobscheduler;

public class PrintShop {
    public static void main(String[] args) throws Exception {
        long start = System.currentTimeMillis();

        Thread j1 = new Thread(new PrintJob("Job1", 10), "Low Priority");
        Thread j2 = new Thread(new PrintJob("Job2", 5), "High Priority");
        Thread j3 = new Thread(new PrintJob("Job3", 15), "Low Priority");
        Thread j4 = new Thread(new PrintJob("Job4", 8), "Medium Priority");
        Thread j5 = new Thread(new PrintJob("Job5", 12), "High Priority");

        j1.setPriority(5);
        j2.setPriority(8);
        j3.setPriority(3);
        j4.setPriority(6);
        j5.setPriority(7);

        System.out.println("Starting print jobs...");

        j1.start();
        j2.start();
        j3.start();
        j4.start();
        j5.start();

        j1.join();
        j2.join();
        j3.join();
        j4.join();
        j5.join();

        long end = System.currentTimeMillis();
        System.out.println("All jobs completed in " + (end - start) + "ms");
    }
}
