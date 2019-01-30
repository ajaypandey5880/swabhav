package com.techlabs.observer.pattern;

public class SmsListner implements IAccountListener{

	@Override
	public void balanceChange(Account account) {
		System.out.println("Sms notification");
		System.out.println(account.getName()+"transaction has happen from "+account.getAccountNo());
		System.out.println("current balance :\t" +account.getBalance()+"\n");
	}

}
