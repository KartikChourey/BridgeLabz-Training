// Import Scanner class
import java.util.Scanner;

public class NaturalFor {
 public static void main(String[] args) {

        // Create Scanner object
        Scanner sc = new Scanner(System.in);

        // Take input number
        int n = sc.nextInt();

        // Check if number is natural
        if (n > 0) {

            // Initialize sum variable
            int sumFor = 0;

            // For loop to calculate sum
            for (int i = 1; i <= n; i++) {

                sumFor = sumFor + i;
            }

            // Calculate sum using formula
            int sumFormula = n * (n + 1) / 2;

            // Print sum using for loop
            System.out.println("Sum using for loop: " + sumFor);

            // Print sum using formula
            System.out.println("Sum using formula: " + sumFormula);
        }
    }
}
