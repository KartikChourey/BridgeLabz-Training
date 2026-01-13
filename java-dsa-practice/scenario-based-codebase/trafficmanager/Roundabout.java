package trafficmanager;



import java.util.LinkedList;
import java.util.Queue;

public class Roundabout {

    private VehicleNode head = null;   
    private int currentVehicles = 0;
    private final int MAX_CAPACITY = 5;

    private Queue<String> waitingQueue = new LinkedList<>();

    public void arrive(String vehicleNumber) {

        if (currentVehicles >= MAX_CAPACITY) {
            waitingQueue.offer(vehicleNumber);
            System.out.println("Roundabout full. Vehicle queued: " + vehicleNumber);
            return;
        }

        addToRoundabout(vehicleNumber);
    }

    private void addToRoundabout(String vehicleNumber) {

        VehicleNode newNode = new VehicleNode(vehicleNumber);

        if (head == null) {
            head = newNode;
            newNode.next = head;
        } else {
            VehicleNode temp = head;
            while (temp.next != head) {
                temp = temp.next;
            }
            temp.next = newNode;
            newNode.next = head;
        }

        currentVehicles++;
        System.out.println("Vehicle entered roundabout: " + vehicleNumber);
    }

    public void exitVehicle() {

        if (head == null) {
            System.out.println("Roundabout empty. No vehicle to exit.");
            return;
        }

        String exitedVehicle = head.vehicleNumber;

        if (head.next == head) {
            head = null;
        } else {
            VehicleNode temp = head;
            while (temp.next != head) {
                temp = temp.next;
            }
            head = head.next;
            temp.next = head;
        }

        currentVehicles--;
        System.out.println("Vehicle exited: " + exitedVehicle);

        if (!waitingQueue.isEmpty()) {
            addToRoundabout(waitingQueue.poll());
        }
    }

    public void displayRoundabout() {

        if (head == null) {
            System.out.println("Roundabout is empty.");
            return;
        }

        System.out.print("Roundabout Vehicles: ");
        VehicleNode temp = head;

        do {
            System.out.print(temp.vehicleNumber + " → ");
            temp = temp.next;
        } while (temp != head);

        System.out.println("(back to start)");
    }
}
