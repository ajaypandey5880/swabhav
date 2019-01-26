package com.techlabs.shoppingcart;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

public class Order {
	private Date date;
	private List<LineItems> items = new ArrayList<LineItems>();
	private Calendar calender;
	private double totalprice;
	private double totalsaving;

	public Order(Date date) {
		this.date = date;
	}

	public Date getDate() {
		return date;
	}

	public List<LineItems> getItems() {
		return items;
	}

	public void addItems(LineItems lineItems) {
		for (int i = 0; i < items.size(); i++) {
			if (lineItems.getProduct().getId() == items.get(i).getProduct().getId()) {
				items.get(i).setQuantity(lineItems.getQuantity()+items.get(i).getQuantity());
				return;
			}
		}
		this.items.add(lineItems);
	}

}
