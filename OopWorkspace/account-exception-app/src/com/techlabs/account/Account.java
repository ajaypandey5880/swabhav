package com.techlabs.account;

public class Account implements Cloneable {
	private int accountNo;
	private String name;
	private double balance;
	private static int accountNoGenerater;
	static {
		accountNoGenerater = 1;
	}

	public Account(String name, double balance) {
		this.name = name;
		this.balance = balance;
		this.accountNo = accountNoGenerater;
		accountNoGenerater++;
	}

	public Account(String name) {
		this(name, 500);
	}

	public void deposit(double amount) {
		balance = balance + amount;
	}

	public void withdraw(double amount) {

		if (balance - amount <= 500) {
			throw new InsufficientFundsException(this, amount);
		}
		balance = balance - amount;

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

	@Override
	public String toString() {
		return "previous output was :" + super.toString() + "\nname is :" + this.getName() + "\nbalance is :"
				+ this.getBalance() + "\naccount no is :" + this.getAccountNo();

	}

	@Override
	public boolean equals(Object obj) {
		Account account = (Account) obj;
		if (this.getName() == account.getName() && this.getBalance() == account.getBalance()) {
			return true;
		}
		return false;
	}

	@Override
	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

}
