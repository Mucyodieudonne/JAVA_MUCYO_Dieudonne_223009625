/***
=======Names==========
1)MUCYO Dieudonne 223009625
2)UZABAKIRIHO Theogene 223009518
3)IHIMBAZWE Genevieve 223014976
4)NIYOGISUBIZO Benoit 223007262
5)IKIREZI Denyse 223015956
6)UWASHEMA Victorine 223012958
7) UMWARI Justine
***/package com.ATM_Simulation;

public class ATMSimulation {

	    public static void main(String[] args) {
	        // Create ATM with initial balance of 5000
	        ATM atm = new ATM(5000);

	        int enteredPin = 1234;

	        if (atm.authenticate(enteredPin)) {
	            System.out.println("PIN Correct. Access Granted.\n");

	            atm.checkBalance();        
	            atm.deposit(10000);        
	            atm.withdraw(3000);          
	            atm.checkBalance();         
	        } else {
	            System.out.println("Incorrect PIN. Access Denied.");
	        }

	    }}
