package com.constructor.level1;

public class Vehicle {
    String ownerName;
    String vehicleType;
    static double registrationFee = 5000; // fixed fee

    Vehicle(String ownerName, String vehicleType) {
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
    }

    void showVehicle() {
        System.out.println(ownerName + " owns " + vehicleType);
    }

    // change fee for all vehicles
    static void updateFee(double fee) {
        registrationFee = fee;
    }
}

