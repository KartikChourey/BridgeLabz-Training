// Import Scanner class for input
import java.util.Scanner;
public class FizzBuzzFor {

    public static void main(String[] args) {

        // Create Scanner object
        Scanner sc = new Scanner(System.in);

        // Take number input from user
        int number = sc.nextInt();

        // Check if number is positive
        if (number > 0) {

            // Loop from 1 to number
            for (int i = 1; i <= number; i++) {

                // Check if multiple of both 3 and 5
                if (i % 3 == 0 && i % 5 == 0) {
                    System.out.println("FizzBuzz");
                }
                // Check if multiple of 3
                else if (i % 3 == 0) {
                    System.out.println("Fizz");
                }
                // Check if multiple of 5
                else if (i % 5 == 0) {
                    System.out.println("Buzz");
                }
                else {
                    System.out.println(i);
                }
            }
        }
    }
}
