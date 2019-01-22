package com.techlabs.accounttest;

import com.techlabs.account.Account;

public class TestClone {

	public static void main(String[] args) throws CloneNotSupportedException {
		Account account = new Account("ajay");
		Account account1 = (Account) account.clone();
		System.out.println(account == account1);
		System.out.println(account.equals(account1));
		System.out.println(account.hashCode());
		System.out.println(account1.hashCode());
	}

}
