package com.techlabs.shoppingcart;

import java.util.ArrayList;
import java.util.List;

public class Customer {
	private String name;
	private String location;
	List<Order> orders = new ArrayList<Order>();

	public Customer(String name, String location) {
		this.name = name;
		this.location = location;
	}
	
	public List<Order> getOrder(){
		return orders;
	}

	public String getName() {
		return name;
	}

	public String getLocation() {
		return location;
	}

	public void addOrder(Order order) {
		orders.add(order);
	}
}
