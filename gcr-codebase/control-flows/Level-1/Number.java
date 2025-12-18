import java.util.Scanner;

public class Number {
    public static void main(String[] args) {

        // Create Scanner object
        Scanner sc = new Scanner(System.in);

        // Take number input
        int number = sc.nextInt();

        // Check if number is positive
        if (number > 0) {

            // Print positive
            System.out.println("Positive");
        }
        // Check if number is negative
        else if (number < 0) {

            // Print negative
            System.out.println("Negative");
        }
        // Otherwise number is zero
        else {

            // Print zero
            System.out.println("Zero");
        }
    }
}
