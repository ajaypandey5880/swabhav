package com.techlabs.observer.pattern;

import java.util.ArrayList;
import java.util.List;

public class Account {
	private int accountNo;
	private String name;
	private double balance;
	private List<IAccountListener> accountListner;
	public Account(int accountNo, String name, double balance) {
		this.accountNo = accountNo;
		this.name = name;
		this.balance = balance;
		accountListner = new ArrayList<IAccountListener>();
	}
	
	public void registerListner(IAccountListener accountListener) {
		accountListner.add(accountListener);
	}
	
	public void deposit(int amount) {
		balance = balance + amount;
		notifyListner();
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

	public void withdraw(int amount) {
		balance = balance - amount;
		notifyListner();
	}
	
	public void notifyListner() {
		for (IAccountListener listener : accountListner) {
			listener.balanceChange(this);
		}
	}
	
}
