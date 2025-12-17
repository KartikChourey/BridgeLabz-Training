import java.util.Scanner;

public class FeetConversion {
    public static void main(String[] args) {

        // Scanner object
        Scanner input = new Scanner(System.in);

        // Taking distance in feet
        System.out.print("Enter distance in feet: ");
        double feet = input.nextDouble();

        // Converting feet to yards
        double yards = feet / 3;

        // Converting yards to miles
        double miles = yards / 1760;

        // Printing output
        System.out.println(
            "Distance in yards is " + yards +
            " and distance in miles is " + miles
        );

        // Closing scanner
        input.close();
    }
}
