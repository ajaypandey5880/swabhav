package com.techlabs.shoppingcart;

public class LineItems {
	private int id;
	private int quantity;
	private Product product;

	public LineItems(int id, int quantity, Product product) {
		this.id = id;
		this.quantity = quantity;
		this.product = product;
	}

	public double calculateLineItemDiscountedPrice() {
		return this.product.calculateDiscountedPrice() * quantity;
	}
	
	public double calculateLineItemActualPrice() {
		return this.product.calculateDiscountedPrice() * quantity;
	}

	public int getId() {
		return id;
	}

	public int getQuantity() {
		return quantity;
	}

	public Product getProduct() {
		return product;
	}
}
