
package com.inheritance.hierarchialinheritance.bankaccount;

class CheckingAccount extends BankAccount {

    int withdrawalLimit;

    CheckingAccount(int accNo, double balance, int withdrawalLimit) {
        super(accNo, balance);
        this.withdrawalLimit = withdrawalLimit;
    }

    void displayAccountType() {
        System.out.println("Account Type: Checking Account");
    }
}