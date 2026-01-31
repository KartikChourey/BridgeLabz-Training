package com.functionalinterface;
interface VehicleDashboard {
    void displaySpeed();

    default void displayBattery() {
        System.out.println("Battery: NA");
    }
}

class ElectricCar implements VehicleDashboard {
    public void displaySpeed() {
        System.out.println("Speed: 70 km/h");
    }

    public void displayBattery() {
        System.out.println("Battery: 85%");
    }
}

public class Dashboard {
    public static void main(String[] args) {

        VehicleDashboard car = new ElectricCar();
        car.displaySpeed();
        car.displayBattery();
    }
}
