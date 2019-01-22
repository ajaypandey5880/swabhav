package com.techlabs.accounttest;

import com.techlabs.account.Account;

public class TestAccount {

	public static void main(String[] args) {
		Account account = new Account("ajay");
		Account account1 = new Account("vinod",2000);
		account.deposit(200);
		account.withdraw(300);
		account1.deposit(800);
		account1.withdraw(600);
		displayDetails(account);
		
	}
	
	public static void displayDetails(Account account) {
		System.out.println("Name of Account Holder is:"+account.getName()+"\nAccount No:"+account.getAccountNo()+"\nBalance is:"+account.getBalance());
		
	}

}
