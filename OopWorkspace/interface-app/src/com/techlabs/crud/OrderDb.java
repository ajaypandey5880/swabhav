package com.techlabs.crud;

public class OrderDb implements ICrudable {

	@Override
	public void create() {
		System.out.println("Order is created");
	}

	@Override
	public void read() {
		System.out.println("Read Order");
	}

	@Override
	public void update() {
		System.out.println("Order is Updated");
	}

	@Override
	public void delete() {
		System.out.println("Order is Deleted");
	}

}
