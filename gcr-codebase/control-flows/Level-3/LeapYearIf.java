import java.util.Scanner;

public class LeapYearIf {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Ask user to enter a year
        System.out.println("Enter a year:");

        // Store user input year
        int year = sc.nextInt();

        // Check if year is valid for Gregorian calendar
        if (year >= 1582) {

            // Check if year is divisible by 400
            if (year % 400 == 0)  System.out.println("Year is a Leap Year");

           
            // Check if year is divisible by 100
            else if (year % 100 == 0) {

                System.out.println("Year is not a Leap Year");

            }
            // Check if year is divisible by 4
            else if (year % 4 == 0) {

                // Print leap year message
                System.out.println("Year is a Leap Year");

            }
            // If none of the above conditions are true
            else {

                // Print not a leap year message
                System.out.println("Year is not a Leap Year");

            }

        }
        else {

            System.out.println("Leap Year calculation is valid only for year >= 1582");

        }

     }
}
