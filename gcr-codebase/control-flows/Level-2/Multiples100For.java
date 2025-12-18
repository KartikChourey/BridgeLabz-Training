import java.util.Scanner;

public class Multiples100For {

    public static void main(String[] args) {

        // Create Scanner object
        Scanner sc = new Scanner(System.in);

        // Take number input
        int number = sc.nextInt();

        // Check valid input
        if (number > 0 && number < 100) {

            // Loop from 100 to 1
            for (int i = 100; i >= 1; i--) {

                // Check if i is multiple of number
                if (i % number == 0) {
                    System.out.println(i);
                }
            }
        }
    }
}
