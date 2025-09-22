package com.ba_a_ma;

public class BankAccountManagement {

	public static void main(String[] args) {
		BANK_ACCOUNT acc1 =new BANK_ACCOUNT(101, "Alice", 0 );
		BANK_ACCOUNT acc2 =new BANK_ACCOUNT(102, "Theogene", 3000 );
		
		acc1.deposit(5000);
		acc2.withdrawal(2000);

		System.out.println("\n------Final Account Details-------");
		acc1.displayAccount();
		acc2.displayAccount();
	}

}
