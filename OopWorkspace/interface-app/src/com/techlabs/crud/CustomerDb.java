package com.techlabs.crud;

public class CustomerDb implements ICrudable {

	@Override
	public void create() {
		System.out.println("customer is created");
	}

	@Override
	public void read() {
		System.out.println("customer details");
	}

	@Override
	public void update() {
		System.out.println("custpmer Updated");
	}

	@Override
	public void delete() {
		System.out.println("customer is deleted");
	}

}
