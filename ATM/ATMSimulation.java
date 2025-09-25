package com.ATM;

//Main class to run the simulation
public class ATMSimulation {
 public static void main(String[] args) {
     ATM myATM = new ATM(0); // start with zero balance

     int enteredPin = 1234; // pretend the user enters this
     if (myATM.verifyPin(enteredPin)) {
         System.out.println("PIN verified successfully ✅\n");

         // Simulate transactions
         myATM.deposit(10000);  // Deposit 10,000
         myATM.withdraw(3000);  // Withdraw 3,000

         // Final balance
         System.out.println();
         myATM.checkBalance();  
     } else {
         System.out.println("Invalid PIN ❌");
     }
 }
}