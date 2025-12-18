import java.util.Scanner;

public class FactorsWhile {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Take number input
        int number = sc.nextInt();

        // Initialize counter
        int counter = 1;

        // Check positive number
        if (number > 0) {

            // While loop
            while (counter < number) {

                // Check divisibility
                if (number % counter == 0) {
                    System.out.println(counter);
                }

                // Increment counter
                counter++;
            }
        }
    }
}
