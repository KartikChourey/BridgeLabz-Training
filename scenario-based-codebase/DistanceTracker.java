import java.util.Scanner;

public class DistanceTracker {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int totalDistance = 0;
        char getOff = 'n';

        while (getOff != 'y' && getOff != 'Y') {

            System.out.print("Enter distance covered till next stop (in km): ");
            int distance = sc.nextInt();

            totalDistance = totalDistance + distance;

            System.out.print("Do you want to get off at this stop? (y/n): ");
            getOff = sc.next().charAt(0);
        }

        System.out.println("Total distance traveled: " + totalDistance + " km");
        System.out.println("Have a safe journey!");
    }
}
