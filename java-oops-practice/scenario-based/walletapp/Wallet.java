interface Transferrable {
    void transferTo(Wallet receiver, double amount);
}


abstract class Wallet implements Transferrable {
    private double balance;

    public Wallet(double balance) {
        this.balance = balance;
    }

    protected void addBalance(double amount) {
        balance += amount;
    }

    protected boolean deductBalance(double amount) {
        if (balance >= amount) {
            balance -= amount;
            return true;
        }
        return false;
    }

    public double getBalance() {
        return balance;
    }
}