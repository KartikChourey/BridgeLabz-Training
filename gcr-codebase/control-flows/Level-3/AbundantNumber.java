import java.util.Scanner;

public class AbundantNumber {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int number = sc.nextInt();
        int sum = 0;

        // Loop through all divisors
        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                sum = sum + i;
            }
        }

        if (sum > number) {
            // Print Abundant message
            System.out.println(number + " is an Abundant Number");
        } else {
            // Print Not Abundant message
            System.out.println(number + " is NOT an Abundant Number");
        }

   
    }
}
