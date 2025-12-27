package com.constructor.level1;

public class BankAccount {
    public String accountNumber;
    protected String accountHolder;
    private double balance;

    // method to set balance safely
    public void setBalance(double balance) {
        this.balance = balance;
    }

    // method to read balance
    public double getBalance() {
        return balance;
    }
}

class SavingsAccount extends BankAccount {
    void showAccount() {
        System.out.println(accountNumber + " - " + accountHolder);
    }
}
