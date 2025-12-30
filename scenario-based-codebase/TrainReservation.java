import java.util.Scanner;

public class TrainReservation {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int totalSeats = 5;   // limited seats for simplicity
        int choice;

        System.out.println("Welcome to Train Reservation System");

        while (true) {

            // Menu using switch
            System.out.println("\n1. Book Ticket");
            System.out.println("2. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    // Stop booking if seats are finished
                    if (totalSeats == 0) {
                        System.out.println("sorry! No seats available.");
                        break;   // breaks switch, while will end below
                    }

                    totalSeats--;
                    System.out.println("Ticket Booked Successfully!");
                    System.out.println("Remaining Seats: " + totalSeats);

                    // break booking loop when seats reach zero
                    if (totalSeats == 0) {
                        System.out.println("All seats are booked. Booking closed.");
                        break;
                    }
                    break;

                case 2:
                    System.out.println("Thank you for using the system.");
                    sc.close();
                    return;   // exits program completely

                default:
                    System.out.println("Invalid choice. Try again.");
            }

            // Stop loop if seats are finished
            if (totalSeats == 0) {
                break;
            }
        }
    }
}
