package com.techlabs.account;

public class CurrentAccount extends Account {

	public CurrentAccount(int accountNo, String name, double balance) {
		super(accountNo, name, balance);
	}

	@Override
	public void withdraw(int amount) {
		if (balance - amount < -2000) {
			System.out.println("amount can not be withdrawn");
			return;
		}
		balance = balance - amount;
	}

}
