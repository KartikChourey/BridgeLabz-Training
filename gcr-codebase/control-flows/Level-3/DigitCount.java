import java.util.Scanner;

public class DigitCount {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Ask user to enter a number
        System.out.println("Enter a number:");

        // Store input number
        int number = sc.nextInt();

        int count = 0;

        // Loop until number becomes zero
        while (number != 0) {

            // Remove last digit
            number = number / 10;

            // Increase digit count
            count++;
        }

        // Display the total number of digits
        System.out.println("Number of digits = " + count);

    }
}
