import java.util.Scanner;

public class Multiples100While {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Take number input
        int number = sc.nextInt();

        // Initialize counter
        int counter = 100;

        // Check valid input
        if (number > 0 && number < 100) {

            // While loop
            while (counter >= 1) {

                if (counter % number == 0) {
                    System.out.println(counter);
                }

                // Decrement counter
                counter--;
            }
        }
    }
}
