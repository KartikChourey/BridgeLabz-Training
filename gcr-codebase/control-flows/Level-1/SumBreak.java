import java.util.Scanner;

public class SumBreak{

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Initialize total sum
        double total = 0.0;

        // Infinite loop
        while (true) {

            // Take user input
            double value = sc.nextDouble();

            // Check if value is zero or negative
            if (value <= 0) {

                // Exit loop
                break;
            }

            // Add value to total
            total = total + value;
        }

        // print the total sum
        System.out.println("Total sum is " + total);
    }
}
