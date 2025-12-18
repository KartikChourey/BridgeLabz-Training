import java.util.Scanner;

public class OddEvenNumbers {

    public static void main(String[] args) {

        // Create Scanner object
        Scanner sc = new Scanner(System.in);

        // Take input number
        int number = sc.nextInt();

        // Check if number is natural
        if (number > 0) {

            for (int i = 1; i <= number; i++) {

                // Check if number is even
                if (i % 2 == 0) {

                    // Print even number
                    System.out.println(i + " is Even");
                } else {

                    // Print odd number
                    System.out.println(i + " is Odd");
                }
            }
        }
    }
}
