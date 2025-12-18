import java.util.Scanner;

public class LargestinThree {
public static void main(String[] args) {

        // Create Scanner object
        Scanner sc = new Scanner(System.in);

        //  first number
        int number1 = sc.nextInt();

        //  second number
        int number2 = sc.nextInt();

        //  third number
        int number3 = sc.nextInt();

        // Check if first number is the largest
        System.out.println("Is the first number the largest? " +
                (number1 >= number2 && number1 >= number3));

        //  if second number is the largest
        System.out.println("Is the second number the largest? " +
                (number2 >= number1 && number2 >= number3));

        //  if third number is the largest
        System.out.println("Is the third number the largest? " +
                (number3 >= number1 && number3 >= number2));
    }
}
