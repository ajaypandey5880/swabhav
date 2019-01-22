package com.techlabs.account;

public class SavingAccount extends Account {

	public SavingAccount(int accountNo, String name, double balance) {
		super(accountNo, name, balance);
	}

	public void withdraw(int amount) {
		if (balance - amount < 1000) {
			System.out.println("balance can not be withdrawn");
			return;
		}
		balance = balance - amount;
	}

}
