package com.inheritance.hierarchialinheritance.bankaccount;

class SavingsAccount extends BankAccount {

    double interestRate;

    SavingsAccount(int accNo, double balance, double interestRate) {
        super(accNo, balance);
        this.interestRate = interestRate;
    }

    void displayAccountType() {
        System.out.println("Account Type: Savings Account");
    }
}