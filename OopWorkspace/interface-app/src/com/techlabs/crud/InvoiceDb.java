package com.techlabs.crud;

public class InvoiceDb implements ICrudable {

	@Override
	public void create() {
		System.out.println("Invoice is created");
	}

	@Override
	public void read() {
		System.out.println("Read Invoice");
	}

	@Override
	public void update() {
		System.out.println("Invoice is updated");
	}

	@Override
	public void delete() {
		System.out.println("Invoice is deleted");
	}

}
