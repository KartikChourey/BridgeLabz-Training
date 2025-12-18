import java.util.Scanner;

public class NaturalSum {
    public static void main(String[] args) {

        // Create Scanner object
        Scanner sc = new Scanner(System.in);

        // Take input number
        int number = sc.nextInt();

        // Check if number is natural
        if (number > 0) {

            // Calculate sum using formula
            int sum = number * (number + 1) / 2;

            // Print the result
            System.out.println("The sum of " + number + " natural numbers is " + sum);
        } else {

            System.out.println("The number " + number + " is not a natural number");
        }
    }
}
