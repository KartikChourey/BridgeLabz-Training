import java.util.Scanner;

public class MultiplicationTable {

    public static void main(String[] args) {

        // Create Scanner object
        Scanner sc = new Scanner(System.in);

        // Take number input
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        // Declare array to store multiplication results
        int[] table = new int[10];

        for (int i = 1; i <= 10; i++) {
  // Store multiplication result in array
            table[i - 1] = number * i;
        }
// Display the multiplication table
        for (int i = 1; i <= 10; i++) {
            System.out.println(number + " * " + i + " = " + table[i - 1]);
        }
    }
}
