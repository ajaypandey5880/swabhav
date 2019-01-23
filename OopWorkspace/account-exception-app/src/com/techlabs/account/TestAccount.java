package com.techlabs.account;

import com.techlabs.account.Account;

public class TestAccount {

	public static void main(String[] args) {
		Account account = new Account("akash");
		Account account1 = new Account("vinod", 2000);
		account.deposit(500);
		try {
		account.withdraw(800);
		} catch (Exception ex) {
			System.out.println(ex.getMessage());
		}
		account1.deposit(800);
		account1.withdraw(600);
		displayDetails(account);

	}

	public static void displayDetails(Account account) {
		System.out.println("Name of Account Holder is:" + account.getName() + "\nAccount No:" + account.getAccountNo()
				+ "\nBalance is:" + account.getBalance());

	}

}
