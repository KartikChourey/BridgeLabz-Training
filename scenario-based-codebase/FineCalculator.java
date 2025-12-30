15. Rohan’s Library Reminder App 📚
Rohan wants a fine calculator:
● Input return date and due date.
● If returned late, calculate fine: ₹5/day.
● Repeat for 5 books using for-loop.

import java.util.Scanner;



public class FineCalculator {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int totalFine = 0;

        System.out.println("Rohan's Library Fine Calculator");

        // loop for 5 books
        for (int i = 1; i <= 5; i++) {

            System.out.println("\nBook " + i);

            System.out.print("Enter due date (day number): ");
            int dueDate = sc.nextInt();

            System.out.print("Enter return date (day number): ");
            int returnDate = sc.nextInt();

            // check late return
            if (returnDate > dueDate) {
                int lateDays = returnDate - dueDate;
                int fine = lateDays * 5;

                System.out.println("Returned late by " + lateDays + " days");
                System.out.println("Fine for this book: ₹" + fine);

                totalFine += fine;
            } else {
                System.out.println("Returned on time. No fine.");
            }
        }

        System.out.println("\n Total Fine for all books: ₹" + totalFine);
        sc.close();
    }
}
