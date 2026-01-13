package budgetwise;

class MonthlyBudget extends Budget {

    public MonthlyBudget(double income) {
        super(income);
    }

    public void generateReport() {
        System.out.println("Monthly Savings: ₹" + netSavings());
    }

    public void detectOverspend() {
        if (totalExpenses() > income)
            System.out.println("Overspending detected this month!");
    }
}