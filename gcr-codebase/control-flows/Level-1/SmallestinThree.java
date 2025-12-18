
import java.util.Scanner;

public class SmallestinThree {
 public static void main(String[] args) {

        // Create Scanner object
        Scanner sc = new Scanner(System.in);

        // Take first number input
        int number1 = sc.nextInt();

        // Take second number input
        int number2 = sc.nextInt();

        // Take third number input
        int number3 = sc.nextInt();

        // Check if first number is smallest
        if (number1 < number2 && number1 < number3) {

            // Print Yes if condition is true
            System.out.println("Is the first number the smallest? Yes");
        } else {

            // Print No if condition is false
            System.out.println("Is the first number the smallest? No");
        }
    }
}
