package trafficmanager;

// Node representing a vehicle in the roundabout
class VehicleNode {

    String vehicleNumber;
    VehicleNode next;

    public VehicleNode(String vehicleNumber) {
        this.vehicleNumber = vehicleNumber;
        this.next = null;
    }
}
