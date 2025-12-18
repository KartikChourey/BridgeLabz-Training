import java.util.Scanner;

public class MultiplicationTable {

    public static void main(String[] args) {

        // Create Scanner object
        Scanner sc = new Scanner(System.in);

        // Take number input
        int number = sc.nextInt();

        // Loop from 6 to 9
        for (int i = 6; i <= 9; i++) {

            // Print multiplication table
            System.out.println(number + " * " + i + " = " + (number * i));
        }
    }
}
