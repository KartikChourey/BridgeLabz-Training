package com.multithreading.restaurantsystem;

public class chef extends Thread {
    private String dish;
    private int time;

    chef(String name, String dish, int time) {
        super(name);
        this.dish = dish;
        this.time = time;
    }

    public void run() {
        System.out.println(getName() + " started preparing " + dish);
        int[] steps = {25, 50, 75, 100};
        for (int step : steps) {
            try {
                Thread.sleep(time / 4);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(getName() + " preparing " + dish + ": " + step + "% complete");
        }
    }
}


