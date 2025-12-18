import java.util.Scanner;

public class SumZero{
    public static void main(String[] args) {

        // Create Scanner object
        Scanner sc = new Scanner(System.in);

        // total sum variable
        double total = 0.0;

        // Declare variable for user input
        double value;

        // Take first input
        value = sc.nextDouble();

        // Continue loop until user enters 0
        while (value != 0) {

            // Add value to total
            total = total + value;

            // Take next input
            value = sc.nextDouble();
        }

        // Print the final sum
        System.out.println("Total sum is " + total);
    }
}
