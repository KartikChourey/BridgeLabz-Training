package com.polymorphismandencapsulation.vehiclesystem;

// Main
public class VehicleRentalSystem{

    public static void main(String[] args) {

        ArrayList<Vehicle> vehicles = new ArrayList<>();
        vehicles.add(new Car("MP09AB1234", 1500));

        for (Vehicle v : vehicles) {
            System.out.println("Rental Cost: ₹" + v.calculateRentalCost(3));
            if (v instanceof Insurable) {
                System.out.println(((Insurable) v).getInsuranceDetails());
            }
        }
    }
}