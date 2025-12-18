import java.util.Scanner;

public class CountdownWhile {
    public static void main(String[] args) {

        // Create Scanner object
        Scanner sc = new Scanner(System.in);

        // Take user input for countdown start
        int counter = sc.nextInt();

        // Loop until counter reaches 1
        while (counter >= 1) {

            // Print current counter value
            System.out.println(counter);

            // Decrease counter by 1
            counter--;
        }
    }
}
