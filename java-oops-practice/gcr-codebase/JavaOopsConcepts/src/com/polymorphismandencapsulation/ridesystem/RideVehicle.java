package com.polymorphismandencapsulation.ridesystem; 

// GPS interface
interface GPS {
    void updateLocation(String location);
    String getCurrentLocation();
}

// Abstract vehicle
abstract class RideVehicle {

    protected String driverName;
    protected double ratePerKm;

    RideVehicle(String driverName, double ratePerKm) {
        this.driverName = driverName;
        this.ratePerKm = ratePerKm;
    }

    abstract double calculateFare(double distance);
}