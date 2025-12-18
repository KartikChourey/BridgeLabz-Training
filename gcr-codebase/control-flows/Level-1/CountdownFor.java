import java.util.Scanner;

public class CountdownFor {
    public static void main(String[] args) {

        // Create Scanner object
        Scanner sc = new Scanner(System.in);

        // Take user input
        int number = sc.nextInt();

        // For loop for countdown
        for (int i = number; i >= 1; i--) {

            // Print countdown value
            System.out.println(i);
        }
    }
}
