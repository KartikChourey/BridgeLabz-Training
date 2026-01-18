package bagnballorganizer;
import java.util.*;
public class BagBallApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Bag ID: ");
        String bagId = sc.next();

        System.out.print("Enter Bag Color: ");
        String bagColor = sc.next();

        System.out.print("Enter Bag Capacity: ");
        int capacity = sc.nextInt();

        Bag bag = new Bag(bagId, bagColor, capacity);

        while (true) {
            System.out.println("\n1.Add Ball  2.Remove Ball  3.Display Balls  4.Exit");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter Ball ID Color Size: ");
                    bag.addBall(new Ball(sc.next(), sc.next(), sc.next()));
                    break;

                case 2:
                    System.out.print("Enter Ball ID to remove: ");
                    bag.removeBall(sc.next());
                    break;

                case 3:
                    bag.displayBalls();
                    System.out.println("Total Balls: " + bag.getBallCount());
                    break;

                case 4:
                    sc.close();
                    return;
            }
        }
    }
}