import java.util.*;

class SavingsAccount extends Account {

    double interestRate;

    SavingsAccount(int accountNumber, double balance, double interestRate) {
        super(accountNumber, balance);
        this.interestRate = interestRate;
    }

    // Method specific to savings account
    void calculateInterest() {
        double interest = (balance * interestRate) / 100;
        System.out.println("Interest Earned: ₹" + interest);
    }
}