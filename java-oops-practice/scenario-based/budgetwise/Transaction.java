package budgetwise;

class Transaction {
    double amount;
    String type;     // income / expense
    String category;

    Transaction(double amount, String type, String category) {
        this.amount = amount;
        this.type = type;
        this.category = category;
    }
}
