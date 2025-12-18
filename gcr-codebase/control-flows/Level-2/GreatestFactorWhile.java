import java.util.Scanner;

public class GreatestFactorWhile {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Take number input
        int number = sc.nextInt();

        // Initialize greatest factor
        int greatestFactor = 1;

        // Initialize counter
        int counter = number - 1;

        // While loop
        while (counter >= 1) {

            // Check divisibility
            if (number % counter == 0) {

                greatestFactor = counter;

                break;
            }

            counter--;
        }

        // Print result
        System.out.println(greatestFactor);
    }
}
