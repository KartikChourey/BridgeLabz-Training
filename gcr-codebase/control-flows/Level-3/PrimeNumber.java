import java.util.Scanner;

public class PrimeNumber {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Ask user to enter a number
        System.out.println("Enter a number:");

        // Store user input
        int number = sc.nextInt();

        boolean isPrime = true;

        // Check if number is less than or equal to 1
        if (number <= 1) {

            isPrime = false;
        }

        // Loop from 2 to number - 1
        for (int i = 2; i < number; i++) {

            if (number % i == 0) {

                isPrime = false;

                break;
            }
        }

        if (isPrime) {

            // Print prime number message
            System.out.println(number + " is a Prime Number");
        } else {

            // Print not prime message
            System.out.println(number + " is NOT a Prime Number");
        }

     
    }
}
