import java.util.Scanner;

public class FeetToYardsMiles {
    public static void main(String[] args) {

        // Scanner object
        Scanner input = new Scanner(System.in);

        // Take distance in feet
        System.out.print("Enter distance in feet: ");
        double feet = input.nextDouble();

        // Convert feet to yards (1 yard = 3 feet)
        double yards = feet / 3;

        // Convert yards to miles (1 mile = 1760 yards)
        double miles = yards / 1760;

        // Print result
        System.out.println(
            "The distance in yards is " + yards +
            " while the distance in miles is " + miles
        );

        // Close Scanner
        input.close();
    }
}
