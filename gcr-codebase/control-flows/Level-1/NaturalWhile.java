import java.util.Scanner;

public class NaturalWhile{
public static void main(String[] args) {

        // Create Scanner object
        Scanner sc = new Scanner(System.in);

        // Take input number
        int n = sc.nextInt();

        // Check if number is natural
        if (n > 0) {

            // Initialize sum using while loop
            int sumWhile = 0;

            // Initialize loop variable
            int i = 1;

            // While loop to calculate sum
            while (i <= n) {

                // Add i to sum
                sumWhile = sumWhile + i;

                // Increment i
                i++;
            }

            // Calculate sum using formula
            int sumFormula = n * (n + 1) / 2;

            // Print sum from while loop
            System.out.println("Sum using while loop: " + sumWhile);

            // Print sum from formula
            System.out.println("Sum using formula: " + sumFormula);
        }
    }
}
