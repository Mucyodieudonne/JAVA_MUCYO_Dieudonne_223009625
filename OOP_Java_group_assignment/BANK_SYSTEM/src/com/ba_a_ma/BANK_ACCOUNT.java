package com.ba_a_ma;

public class BANK_ACCOUNT {
	
	private int accountnumber;
	private String holdername;
	private double balance;
	public BANK_ACCOUNT(int accountnumber, String holdername, double balance) {
		super();
		this.accountnumber = accountnumber;
		this.holdername = holdername;
		this.balance = balance;
	}
	public double getbalance() {
		return balance;
	}
	public void deposit (double amount) {
		balance +=amount;
		System.out.println("Deposited "+amount+"Successfully, new balance is :"+balance);
	}
	public void withdrawal(double amount) {
		if(amount>balance) {
			System.out.println("Insufficient Fund!");
		}
		else {
			balance -=amount;
			System.out.println("Withdrew "+amount+"Successfully, New balance "+balance);
		}
		if(balance<1000) {
			System.out.println("Warning: Low balance");
		}
		}
	
public void displayAccount() {
	System.out.println("Account Number: " + accountnumber);
	System.out.println("Holdername: "+holdername);
	System.out.println("Balance: "+balance);
	System.out.println("-----------------------------------");

}
}
