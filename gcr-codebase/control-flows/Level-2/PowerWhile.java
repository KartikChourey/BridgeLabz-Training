import java.util.Scanner;

public class PowerWhile {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Take base number
        int number = sc.nextInt();

        // Take power value
        int power = sc.nextInt();

        // Initialize result
        int result = 1;

        int counter = 0;

        // While loop
        while (counter < power) {

            result = result * number;

            counter++;
        }

        // Print result
        System.out.println(result);
    }
}
