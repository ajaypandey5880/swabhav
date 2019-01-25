package com.techlabs.shoppingcartTest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.techlabs.shoppingcart.Product;

class TestProduct {

	@Test
	void testgetid() {
		Product product = new Product(1, "pen", 15, 10);
		int result = product.getId();
		assertEquals(1, result);
	}
	
	@Test
	void testgetname() {
		Product product = new Product(1, "pen", 15, 10);
		String result = product.getName();
		assertEquals("pen", result);
	}
	
	@Test
	void testgetcost() {
		Product product = new Product(1, "pen", 15, 10);
		double result = product.getCost();
		assertEquals(15, result);
	}
	
	@Test
	void calculatePrice() {
		Product product = new Product(1, "pen", 100, 10);
		double result = product.calculateDiscountedPrice();
		assertEquals(90, result);
	}

}
