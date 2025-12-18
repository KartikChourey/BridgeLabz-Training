import java.util.Scanner;

public class SimpleCalculator {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number:");
        double first = sc.nextDouble();
        System.out.println("Enter second number:");
        double second = sc.nextDouble();
        System.out.println("Enter operator (+, -, *, /):");
        String op = sc.next();

        // Switch case for operation
        switch (op) {
            // Addition case
            case "+":
                System.out.println("Result: " + (first + second));
                break;
            // Subtraction case
            case "-":
                System.out.println("Result: " + (first - second));
                break;
            case "*":
                System.out.println("Result: " + (first * second));
                break;
            // Division case
            case "/":
                System.out.println("Result: " + (first / second));
                break;
            // Invalid operator case
            default:
                System.out.println("Invalid Operator");
        }

       
    }
}
