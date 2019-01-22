package com.techlabs.account.test;
import com.techlabs.account.Account;
import com.techlabs.account.CurrentAccount;
import com.techlabs.account.SavingAccount;

public class TestAccount {

	public static void main(String[] args) {
		SavingAccount savingAccount = new SavingAccount(1,"ajay",2000);
		CurrentAccount currentAccount = new CurrentAccount(2, "vinod", 5000);
		savingAccount.deposit(200);
		savingAccount.withdraw(500);
		currentAccount.deposit(1000);
		currentAccount.withdraw(9000);
		printdetails(savingAccount);
		printdetails(currentAccount);
	}
	public static void printdetails(Account account) {
		System.out.println("Name is "+account.getName()+" balance is "+account.getBalance()+" account no is "+account.getAccountNo());
	}
}
