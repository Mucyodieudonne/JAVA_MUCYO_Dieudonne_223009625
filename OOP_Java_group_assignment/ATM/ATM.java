package com.ATM;

class ATM {
    private double balance;
    private int pin = 1234; // fixed PIN for authentication

    // Constructor to set initial balance
    public ATM(double initialBalance) {
        this.balance = initialBalance;
    }

    // Method to check balance
    public void checkBalance() {
        System.out.println("Current balance: " + balance);
    }

    // Method to deposit money
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Invalid deposit amount!");
        }
    }

    // Method to withdraw money
    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Insufficient balance!");
        }
    }

    // Method to verify PIN
    public boolean verifyPin(int enteredPin) {
        return this.pin == enteredPin;
    }
}
