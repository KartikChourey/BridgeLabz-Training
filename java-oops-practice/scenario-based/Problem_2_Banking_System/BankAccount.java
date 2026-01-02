import java.util.*;

interface Loanable {
    void applyForLoan();
    boolean calculateLoanEligibility();
}

abstract class BankAccount {
    private String accountNumber;
    private String holderName;
    protected double balance;

    public BankAccount(String accNo, String name, double balance) {
        this.accountNumber = accNo;
        this.holderName = name;
        this.balance = balance;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        if (amount <= balance)
            balance -= amount;
        else
            System.out.println("Insufficient balance");
    }

    public abstract double calculateInterest();

    public void displayAccount() {
        System.out.println("Account Holder : " + holderName);
        System.out.println("Balance : ₹" + balance);
        System.out.println("Interest : ₹" + calculateInterest());
    }
}