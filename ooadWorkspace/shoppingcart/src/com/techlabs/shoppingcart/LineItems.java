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

	
	public double calculateLineItemActualPrice() {
		return this.product.getCost() * quantity;
	}
	
	
	public double calculateLineItemDiscountedPrice() {
		return this.product.calculateDiscountedPrice() * quantity;
	}

	public int getId() {
		return id;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}


	public Product getProduct() {
		return product;
	}
}
