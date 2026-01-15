import java.time.LocalDate;

public class ElectricityBill extends Bill {
    public ElectricityBill(double amount, LocalDate dueDate) {
        super("Electricity", amount, dueDate);
    }

    public void sendReminder() {
        System.out.println("Electricity Bill Reminder!");
    }
}