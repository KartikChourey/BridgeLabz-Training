package fleetmanager;

class Vehicle {
    String vehicleId;
    int mileage;

    public Vehicle(String vehicleId, int mileage) {
        this.vehicleId = vehicleId;
        this.mileage = mileage;
    }

    @Override
    public String toString() {
        return vehicleId + " → Mileage: " + mileage;
    }
}
