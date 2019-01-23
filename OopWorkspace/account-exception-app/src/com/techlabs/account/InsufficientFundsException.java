package com.techlabs.account;

public class InsufficientFundsException extends RuntimeException {
	private double balance;
	private String name;
	private double amount;

	public InsufficientFundsException(Account account, double amount) {
		this.balance = account.getBalance();
		this.name = account.getName();
		this.amount = amount;
	}

	@Override
	public String getMessage() {
		return "Dear customer " + name + " your balance is " + balance + " so the amount requested amount " + amount
				+ " cannot be withdrwan\nBusiness" + " requirement does not meet";
	}

}
