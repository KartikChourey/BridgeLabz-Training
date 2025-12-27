package com.constructor.level1;

public class CarRental {
    String customerName;
    String carModel;
    int rentalDays;
    static final int COST_PER_DAY = 1500;

    CarRental(String customerName, String carModel, int rentalDays) {
        this.customerName = customerName;
        this.carModel = carModel;
        this.rentalDays = rentalDays;
    }

    int calculateTotalCost() {
        return rentalDays * COST_PER_DAY;
    }
}
