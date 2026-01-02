class Bill implements Payable {
    private double amount;

    public Bill(double amount) {
        this.amount = amount;
    }

    @Override
    public double calculatePayment() {
        double tax = amount * 0.05;     // 5% tax
        double discount = amount * 0.10; // 10% discount
        return amount + tax - discount;
    }
}