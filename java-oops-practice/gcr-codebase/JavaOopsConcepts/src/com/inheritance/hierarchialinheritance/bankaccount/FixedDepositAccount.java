package com.inheritance.hierarchialinheritance.bankaccount;

class FixedDepositAccount extends BankAccount {

    int maturityYears;

    FixedDepositAccount(int accNo, double balance, int maturityYears) {
        super(accNo, balance);
        this.maturityYears = maturityYears;
    }

    void displayAccountType() {
        System.out.println("Account Type: Fixed Deposit Account");
    }
}