import java.util.Scanner;

public class FactorialWhile {

    public static void main(String[] args) {

        // Create Scanner object
        Scanner sc = new Scanner(System.in);

        // Take integer input
        int number = sc.nextInt();

        // Check if number is positive
        if (number > 0) {

            // Initialize factorial value
            int fact = 1;

            int i = 1;

            while (i <= number) {

                // Multiply factorial with i
                fact = fact * i;

                i++;
            }

            // Print factorial result
            System.out.println("Factorial is " + fact);
        }
    }
}
