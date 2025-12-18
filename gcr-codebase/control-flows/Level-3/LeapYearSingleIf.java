import java.util.Scanner;

public class LeapYearSingleIf {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a year:");

        int year = sc.nextInt();

        // Check if year is valid for Gregorian calendar
        if (year >= 1582) {

            // Single if condition using logical operators to check leap year
            if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {

                // Print leap year message
                System.out.println("Year is a Leap Year");

            }
            // If condition is false
            else {

                System.out.println("Year is not a Leap Year");

            }

        }
        // If year is less than 1582
        else {

            System.out.println("Leap Year calculation is valid only for year >= 1582");

        }

     
    }
}
