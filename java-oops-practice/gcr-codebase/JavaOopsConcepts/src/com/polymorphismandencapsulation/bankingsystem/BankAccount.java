package com.polymorphismandencapsulation.bankingsystem;

// Loan interface
interface Loanable {
    void applyForLoan();
    double calculateLoanEligibility();
}

// Abstract bank account
abstract class BankAccount {

    private int accountNumber;
    private String holderName;
    protected double balance;

    BankAccount(int accNo, String name, double balance) {
        this.accountNumber = accNo;
        this.holderName = name;
        this.balance = balance;
    }

    void deposit(double amount) {
        balance += amount;
    }

    void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
        }
    }

    abstract double calculateInterest();
}