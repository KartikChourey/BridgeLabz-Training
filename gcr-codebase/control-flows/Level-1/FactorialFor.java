import java.util.Scanner;

public class FactorialFor {

    public static void main(String[] args) {

        // Create Scanner object
        Scanner sc = new Scanner(System.in);

        // Take integer input
        int number = sc.nextInt();

        // Check if number is positive
        if (number > 0) {

            int fact = 1;

            // For loop to calculate factorial
            for (int i = 1; i <= number; i++) {

                fact = fact * i;
            }

            // Print factorial result
            System.out.println("Factorial is " + fact);
        }
    }
}
