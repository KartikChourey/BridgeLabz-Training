import java.util.Scanner;

public class GreatestFactorFor {

    public static void main(String[] args) {

        // Create Scanner object
        Scanner sc = new Scanner(System.in);

        // Take number input
        int number = sc.nextInt();

        // Initialize greatest factor
        int greatestFactor = 1;

        for (int i = number - 1; i >= 1; i--) {

            // Check divisibility
            if (number % i == 0) {

                // Assign factor
                greatestFactor = i;

                // Exit loop
                break;
            }
        }

        // Print greatest factor
        System.out.println(greatestFactor);
    }
}
