package com.techlabs.crudtest;

import com.techlabs.crud.CustomerDb;
import com.techlabs.crud.ICrudable;
import com.techlabs.crud.InvoiceDb;
import com.techlabs.crud.OrderDb;

public class TestICrudable {

	public static void main(String[] args) {
		doDbOPeration(new CustomerDb());
		doDbOPeration(new InvoiceDb());
		doDbOPeration(new OrderDb());
	}

	public static void doDbOPeration(ICrudable a) {
		a.create();
		a.delete();
		a.read();
		a.update();
		System.out.println("\n");
	}

}
