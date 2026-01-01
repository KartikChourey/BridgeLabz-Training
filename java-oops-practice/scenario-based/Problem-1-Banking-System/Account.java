import java.util.Scanner;

// Base class 

class Account {

    int accountNumber;
    double balance;

    Account(int accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    void deposit(double amount) {
        if (amount <= 0) {
            System.out.println("Invalid deposit amount");
            return;
        }
        balance = balance + amount;
        System.out.println("Amount deposited successfully");
    }

    // Method to withdraw money
    void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Invalid withdrawal amount");
        } 
        else if (amount > balance) {
            System.out.println("Insufficient balance");
        } 
        else {
            balance = balance - amount;
            System.out.println("Withdrawal successful");
        }
    }

    // Display current balance
    void showBalance() {
        System.out.println("Current Balance: ₹" + balance);
    }
}
