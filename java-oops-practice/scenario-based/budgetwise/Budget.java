package budgetwise;
import java.util.*;
abstract class Budget implements IAnalyzable {

    protected double income;
    private List<Transaction> expenses = new ArrayList<>();

    public Budget(double income) {
        this.income = income;
    }

    // Encapsulated expense addition
    public void addExpense(Transaction t) {
        if (t.type.equals("expense")) {
            expenses.add(t);
        }
    }

    protected double totalExpenses() {
        double sum = 0;
        for (Transaction t : expenses) sum += t.amount;
        return sum;
    }

    // Operator usage
    protected double netSavings() {
        return income - totalExpenses();
    }
}
