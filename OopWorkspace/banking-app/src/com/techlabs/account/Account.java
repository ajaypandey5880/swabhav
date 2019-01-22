package com.techlabs.account;

public abstract class Account {
	private int accountNo;
	private String name;
	protected double balance;

	public Account(int accountNo,String name,double balance) {
		this.accountNo=accountNo;
		this.name=name;
		this.balance= balance;
	}
	
	public int getAccountNo() {
		return accountNo;
	}

	public String getName() {
		return name;
	}

	public double getBalance() {
		return balance;
	}
	
	public void deposit(int amount) {
		balance = balance + amount;
	}
	
	abstract void withdraw(int amount);
}
