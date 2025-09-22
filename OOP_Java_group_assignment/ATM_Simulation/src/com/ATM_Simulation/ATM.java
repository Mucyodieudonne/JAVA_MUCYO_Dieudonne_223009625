package com.ATM_Simulation;

class ATM {
    private double balance;   
    private final int pin = 1234; 

    // Constructor with initial balance
    ATM(double initialBalance) {
        this.balance = initialBalance;
    }

    // Authenticate user
    boolean authenticate(int enteredPin) {
        return enteredPin == pin;
    }

    // Check balance
    void checkBalance() {
        System.out.println("Current Balance: " + balance);
    }

    // Deposit money
    void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Invalid deposit amount!");
        }
    }

    // Withdraw money
    void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Insufficient balance or invalid amount!");
        }
    }
}