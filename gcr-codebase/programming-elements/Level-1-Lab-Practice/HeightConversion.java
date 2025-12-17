import java.util.Scanner;

public class HeightConversion {
    public static void main(String[] args) {

        // Scanner object for input
        Scanner input = new Scanner(System.in);

        // Taking height in centimeters
        System.out.print("Enter height in centimeters: ");
        double cm = input.nextDouble();

        // Converting cm to inches
        double inches = cm / 2.54;

        // Calculating feet
        int feet = (int) (inches / 12);

        // Calculating remaining inches
        double remainingInches = inches % 12;

        // Printing result
        System.out.println(
            "Your Height in cm is " + cm +
            " while in feet is " + feet +
            " and inches is " + remainingInches
        );

        // Closing scanner
        input.close();
    }
}
