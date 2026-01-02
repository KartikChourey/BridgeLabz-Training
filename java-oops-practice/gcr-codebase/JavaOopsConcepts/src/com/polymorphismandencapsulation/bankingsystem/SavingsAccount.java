package com.polymorphismandencapsulation.bankingsystem;

// Savings account
class SavingsAccount extends BankAccount implements Loanable {

    SavingsAccount(int accNo, String name, double balance) {
        super(accNo, name, balance);
    }

    double calculateInterest() {
        return balance * 0.04;
    }

    public void applyForLoan() {
        System.out.println("Loan applied for Savings Account");
    }

    public double calculateLoanEligibility() {
        return balance * 5;
    }
}