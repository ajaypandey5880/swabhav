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

	public double getTotalprice() {
		return totalprice;
	}

	public double getTotalsaving() {
		return totalsaving;
	}

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
		this.items.add(lineItems);
	}

	public Calendar getCalender() {
		return calender;
	}

	public double totalPrice() {
		double totalprice = 0;
		for (LineItems eachitem : items) {
			totalprice = totalprice + eachitem.calculateLineItemDiscountedPrice();
		}
		return totalprice;
	}
	
	public double totalDiscount() {
		double totaldiscount = 0;
		for (LineItems eachitem : items) {
			totaldiscount = totaldiscount +( eachitem.calculateLineItemActualPrice() - eachitem.calculateLineItemDiscountedPrice());
		}
		return totaldiscount;
	}

}
