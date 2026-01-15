import java.time.LocalDate;

public class WaterBill extends Bill {
    public WaterBill(double amount, LocalDate dueDate) {
        super("Water", amount, dueDate);
    }

    public void sendReminder() {
        System.out.println("Water Bill Reminder!");
    }
}