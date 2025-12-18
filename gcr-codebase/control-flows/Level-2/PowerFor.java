import java.util.Scanner;

public class PowerFor {

    public static void main(String[] args) {

        // Create Scanner object
        Scanner sc = new Scanner(System.in);

        // Take base number
        int number = sc.nextInt();

        int power = sc.nextInt();

        int result = 1;

        // For loop
        for (int i = 1; i <= power; i++) {

            // Multiply result
            result = result * number;
        }

        // Print result
        System.out.println(result);
    }
}
