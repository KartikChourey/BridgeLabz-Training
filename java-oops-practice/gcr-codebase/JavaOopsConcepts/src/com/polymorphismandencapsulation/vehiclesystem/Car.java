package com.polymorphismandencapsulation.vehiclesystem;

// Car
class Car extends Vehicle implements Insurable {

    Car(String number, double rate) {
        super(number, rate);
    }

    double calculateRentalCost(int days) {
        return rentalRate * days;
    }

    public double calculateInsurance() {
        return 500;
    }

    public String getInsuranceDetails() {
        return "Car insurance applied";
    }
}