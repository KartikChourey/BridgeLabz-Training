import java.util.Scanner;

public class FizzBuzzWhile {

    public static void main(String[] args) {

        // Create Scanner object
        Scanner sc = new Scanner(System.in);

        // Take number input
        int number = sc.nextInt();

        int i = 1;

        // Check for positive number
        if (number > 0) {

            // While loop
            while (i <= number) {

                // Check multiple of 3 and 5
                if (i % 3 == 0 && i % 5 == 0) {
                    System.out.println("FizzBuzz");
                }
                // Check multiple of 3
                else if (i % 3 == 0) {
                    System.out.println("Fizz");
                }
                // Check multiple of 5
                else if (i % 5 == 0) {
                    System.out.println("Buzz");
                }
                // Print number
                else {
                    System.out.println(i);
                }

                i++;
            }
        }
    }
}
