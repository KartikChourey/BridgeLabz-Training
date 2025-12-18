import java.util.Scanner;
public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int number = sc.nextInt();

        // Store original number for comparison
        int originalNumber = number;

        int sum = 0;

        while (originalNumber != 0) {

            // Find the last digit using modulus
            int digit = originalNumber % 10;

            // Find cube of digit and add to sum
            sum = sum + (digit * digit * digit);

            // Remove last digit using division
            originalNumber = originalNumber / 10;
        }
        if (sum == number) {

            // Print Armstrong number message
            System.out.println(number + " is an Armstrong Number");
        } else {

            // Print not Armstrong message
            System.out.println(number + " is NOT an Armstrong Number");
        }

        // Close Scanner
        sc.close();
    }
}
