import java.time.LocalDate;

public class InternetBill extends Bill {
    public InternetBill(double amount, LocalDate dueDate) {
        super("Internet", amount, dueDate);
    }

    public void sendReminder() {
        System.out.println("Internet Bill Reminder!");
    }
}