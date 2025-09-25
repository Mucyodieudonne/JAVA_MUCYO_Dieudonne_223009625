/***--------GROUP MEMBERS----------------

=======Names==========
1)MUCYO Dieudonne 223009625
2)UZABAKIRIHO Theogene 223009518
3)IHIMBAZWE Genevieve 223014976
4)NIYOGISUBIZO Benoit 223007262
5)IKIREZI Denyse 223015956
6)UWASHEMA Victorine 223012958
7) UMWARI Justine
***/
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
