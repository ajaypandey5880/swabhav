package com.techlabs.lineItemtest;

import java.util.ArrayList;

import com.techlabs.lineItem.LineItem;

public class TestLineItemGeneric {
	private static double total = 0;

	public static void main(String[] args) {
		ArrayList<LineItem> cart = new ArrayList<LineItem>();
		cart.add(new LineItem(1, "Pen", 30, 5));
		cart.add(new LineItem(2, "Book", 80, 9));
		cart.add(new LineItem(3, "bag", 1500, 3));
		for (LineItem lineitem : cart) {
			printDetails(lineitem);
			total = total + lineitem.calculateTotal(lineitem);
		}
		System.out.println("Total value of Cart :"+total);
	}

	private static void printDetails(LineItem lineitem) {
		System.out.println(
				+lineitem.getQuantity() + "\t" + lineitem.getName() + "\t" + lineitem.calculateTotal(lineitem));

	}

}
