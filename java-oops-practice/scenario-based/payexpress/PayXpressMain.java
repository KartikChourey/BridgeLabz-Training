import java.time.LocalDate;
import java.util.Scanner;

public class PayXpressMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("1.Electricity 2.Internet 3.Water");
        int choice = sc.nextInt();

        System.out.print("Amount: ");
        double amount = sc.nextDouble();

        System.out.print("Due Date (YYYY-MM-DD): ");
        LocalDate date = LocalDate.parse(sc.next());

        Bill bill = switch (choice) {
            case 1 -> new ElectricityBill(amount, date);
            case 2 -> new InternetBill(amount, date);
            default -> new WaterBill(amount, date);
        };

        bill.sendReminder();
        bill.pay();
    }
}