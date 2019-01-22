package com.techlabs.accounttest;

import com.techlabs.account.Account;

public class TestEquality {

	public static void main(String[] args) {
		Account account = new Account("ajay");
		Account account1 = new Account("ajay");
		System.out.println(account==account);
		System.out.println(account.equals(account));
		System.out.println(account==account1);
		System.out.println(account.equals(account1));
		System.out.println(account.hashCode());
		System.out.println(account1.hashCode());
		Account account2 = account1;
		System.out.println(account2==account1);
		System.out.println(account2.equals(account1));
		System.out.println(account2.hashCode());
		System.out.println(account1.hashCode());
	}

}
