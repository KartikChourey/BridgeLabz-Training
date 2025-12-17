import java.util.Scanner;

public class NumberOfHandshakes {
    public static void main(String[] args) {

        // Scanner object
        Scanner input = new Scanner(System.in);

        // Taking number of students
        System.out.print("Enter number of students: ");
        int numberOfStudents = input.nextInt();

        // Calculating maximum handshakes
        int handshakes = (numberOfStudents * (numberOfStudents - 1)) / 2;

        // Displaying output
        System.out.println("Maximum number of handshakes is " + handshakes);

        // Closing scanner
        input.close();
    }
}
