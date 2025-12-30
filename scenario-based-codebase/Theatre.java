import java.util.Scanner;

public class Theatre {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        char continueBooking = 'y';

        System.out.println("Welcome to Movie Ticket Booking App");

        while (continueBooking == 'y' || continueBooking == 'Y') {

            System.out.print("\nEnter movie type (1-Hollywood, 2-Bollywood): ");
            int movieType = sc.nextInt();

            System.out.print("Enter seat type (gold/silver): ");
            String seatType = sc.next();

            System.out.print("Do you want snacks? (yes/no): ");
            String snacks = sc.next();

            int ticketPrice = 0;

            // switch for movie type
            switch (movieType) {

                case 1:
                    ticketPrice = 200;
                    break;

                case 2:
                    ticketPrice = 150;
                    break;

                default:
                    System.out.println("Invalid movie type");
                    continue;
            }

            // if for seat type
            if (seatType.equalsIgnoreCase("gold")) {
                ticketPrice += 100;
            } else if (seatType.equalsIgnoreCase("silver")) {
                ticketPrice += 50;
            } else {
                System.out.println("Invalid seat type");
                continue;
            }

            // snacks price
            if (snacks.equalsIgnoreCase("yes")) {
                ticketPrice += 80;
            }

            System.out.println("Total Ticket Price: ₹" + ticketPrice);

            System.out.print("\nBook ticket for next customer? (y/n): ");
            continueBooking = sc.next().charAt(0);
        }

        System.out.println("\nThank you for using Movie Booking App!");
     
    }
}
