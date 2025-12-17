import java.util.Scanner;

public class QuotientRemainder {
    public static void main(String[] args) {

        // Scanner object
        Scanner input = new Scanner(System.in);

        // Take first number
        System.out.print("Enter first number: ");
        int number1 = input.nextInt();

        // Take second number
        System.out.print("Enter second number: ");
        int number2 = input.nextInt();

        // Calculate quotient
        int quotient = number1 / number2;

        // Calculate remainder
        int remainder = number1 % number2;

        // Print result
        System.out.println(
            "The Quotient is " + quotient +
            " and Reminder is " + remainder +
            " of two number " + number1 +
            " and " + number2
        );

        // Close Scanner
        input.close();
    }
}
