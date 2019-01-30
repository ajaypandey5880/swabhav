package com.techlabs.observer.pattern.test;

import com.techlabs.observer.pattern.Account;
import com.techlabs.observer.pattern.EmailListner;
import com.techlabs.observer.pattern.SmsListner;

public class AccountTest {

	public static void main(String[] args) {
		Account account = new Account(123, "ajay", 20000);
		account.registerListner(new EmailListner());
		account.deposit(500);
		account.registerListner(new SmsListner());
		account.withdraw(200);
	}
}
