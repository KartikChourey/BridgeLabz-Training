package com.polymorphismandencapsulation.vehiclesystem;

import java.util.ArrayList;

// Insurance interface
interface Insurable {
    double calculateInsurance();
    String getInsuranceDetails();
}

// Abstract vehicle
abstract class Vehicle {

    private String vehicleNumber;
    protected double rentalRate;

    Vehicle(String vehicleNumber, double rentalRate) {
        this.vehicleNumber = vehicleNumber;
        this.rentalRate = rentalRate;
    }

    abstract double calculateRentalCost(int days);
}