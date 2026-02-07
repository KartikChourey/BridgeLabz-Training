package com.multithreading.bankingsystem;

import java.time.LocalTime;

public class BankAccount {
    int balance = 10000;

    void withdraw(String customer, int amount) {
        System.out.println("[" + customer + "] Attempting to withdraw " + amount);
        if (balance >= amount) {
            balance -= amount;
            System.out.println("Transaction successful: " + customer +
                    ", Amount: " + amount +
                    ", Balance: " + balance +
                    ", Time: " + LocalTime.now());
        } else {
            System.out.println("Transaction failed: " + customer +
                    ", Insufficient balance, Time: " + LocalTime.now());
        }
    }
}

class Transaction implements Runnable {
    BankAccount account;
    int amount;

    Transaction(BankAccount account, int amount) {
        this.account = account;
        this.amount = amount;
    }

    public void run() {
        System.out.println(Thread.currentThread().getName() + " State: " + Thread.currentThread().getState());
        account.withdraw(Thread.currentThread().getName(), amount);
    }
}


