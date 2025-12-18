import java.util.Scanner;

public class HarshadNumber {
  public static void main(String[] args) {
 Scanner sc = new Scanner(System.in);
        // Ask user to enter a number
        System.out.println("Enter a number:");
        // Store input number
        int number = sc.nextInt();
        // Store original number
        int temp = number;
        // Initialize sum variable
        int sum = 0;

        while (temp != 0) {
            int digit = temp % 10;
            sum = sum + digit;
            temp = temp / 10;
        }

        // Check divisibility by sum of digits
        if (number % sum == 0) {
            // Print Harshad message
            System.out.println(number + " is a Harshad Number");
        } else {
            // Print Not Harshad message
            System.out.println(number + " is NOT a Harshad Number");
        }

        // Close Scanner
        sc.close();
    }
}
