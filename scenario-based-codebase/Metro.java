import java.util.Scanner;

public class Metro{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double balance = 100; // initial balance
        int distance;
        double fare;

        while (balance > 0) {
            System.out.println("\nCurrent Balance: ₹" + balance);
            System.out.print("Enter distance (0 to quit): ");
            distance = sc.nextInt();

            if (distance == 0) {
                break;
            }

            fare = (distance <= 5) ? 10 :
                   (distance <= 15) ? 20 : 30;

            if (balance >= fare) {
                balance -= fare;
                System.out.println("Fare ₹" + fare + " deducted");
            } else {
                System.out.println("Insufficient balance");
                break;
            }
        }

        System.out.println("Thank you for using Delhi Metro 🚇");
        
    }
}
