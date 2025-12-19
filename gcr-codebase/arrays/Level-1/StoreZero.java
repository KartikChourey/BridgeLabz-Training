import java.util.Scanner;

public class StoreZero {
 public static void main(String[] args) {
  // Create Scanner object
        Scanner sc = new Scanner(System.in);

        // Declare double array of size 10
        double[] numbers = new double[10];
        // Variable to store sum
        double total = 0.0;
        // Index variable
        int index = 0;
		
 // Infinite while loop
        while (true) {
 // Ask user to enter number
           System.out.print("Enter a number: ");
            double input = sc.nextDouble();
// Break if number is 0 or negative
            if (input <= 0) {
                break;
            }
            // Break if array size reaches 10
            if (index == 10) {
                break;
            }
            // Store number in array
            numbers[index] = input;
            // Increment index
            index++;
        }
        for (int i = 0; i < index; i++) {
            total = total + numbers[i];
        }
        // Display total sum
        System.out.println("Total sum = " + total);
    }
}
