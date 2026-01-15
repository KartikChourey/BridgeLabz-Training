import java.time.LocalDate;

public abstract class Bill implements IPayable {
    protected String type;
    protected double amount;
    protected LocalDate dueDate;
    private boolean isPaid;

    protected double penalty = 50;

    public Bill(String type, double amount, LocalDate dueDate) {
        this.type = type;
        this.amount = amount;
        this.dueDate = dueDate;
        this.isPaid = false;
    }

    public final void pay() {
        if (!isPaid) {
            double payableAmount = calculateLateFee();
            System.out.println(type + " Bill Paid: ₹" + payableAmount);
            isPaid = true;
        } else {
            System.out.println(type + " Bill already paid.");
        }
    }

    protected double calculateLateFee() {
        if (LocalDate.now().isAfter(dueDate)) {
            return amount + penalty;
        }
        return amount;
    }
}