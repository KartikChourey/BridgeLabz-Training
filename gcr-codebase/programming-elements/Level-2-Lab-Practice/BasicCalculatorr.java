import java.util.Scanner;

public class BasicCalculatorr {
    public static void main(String[] args) {

        // Create Scanner object to take user input
        Scanner input = new Scanner(System.in);

        // Take first floating-point number
        System.out.print("Enter first number: ");
        double number1 = input.nextDouble();

        // Take second floating-point number
        System.out.print("Enter second number: ");
        double number2 = input.nextDouble();

        // Perform arithmetic operations
        double addition = number1 + number2;
        double subtraction = number1 - number2;
        double multiplication = number1 * number2;
        double division = number1 / number2;

        // Print all results
        System.out.println(
            "The addition, subtraction, multiplication, and division value of 2 numbers " +
            number1 + " and " + number2 + " is " +
            addition + ", " + subtraction + ", " +
            multiplication + ", and " + division
        );

        // Close Scanner
        input.close();
    }
}
