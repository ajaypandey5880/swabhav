package com.techlabs.lineItemtest;

import java.util.ArrayList;

import com.techlabs.lineItem.LineItem;

public class TestLineItem {
	private static double total = 0;
	public static void main(String[] args) {
		ArrayList cart = new ArrayList();
		cart.add(new LineItem(1, "Pen", 30, 5));
		cart.add(new LineItem(2, "Book", 80	,9));
		cart.add(new LineItem(3, "bag", 1500, 3));
		//cart.add("swabhav");
		//cart.add(100);
		for(Object obj : cart) {
			LineItem lineitem = (LineItem)(obj);
			printDetais(lineitem);
			total = total + lineitem.calculateTotal(lineitem);
		}
		System.out.println("Total value of cart :"+total);
	}
	public static void printDetais(LineItem lineitem) {
		System.out.println(+lineitem.getQuantity()+"\t"+lineitem.getName()+"\t"+lineitem.calculateTotal(lineitem));
	}
}
