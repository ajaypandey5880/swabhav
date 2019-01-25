package com.techlabs.shoppingcartconsole;

import java.util.Date;

import com.techlabs.shoppingcart.Customer;
import com.techlabs.shoppingcart.LineItems;
import com.techlabs.shoppingcart.Order;
import com.techlabs.shoppingcart.Product;

public class CartDetails {

	public static void main(String[] args) {
		Date date = new Date();
		Customer customer = new Customer("akash", "Dahisar");
		Order order = new Order(date);
		order.addItems(new LineItems(1, 2, new Product(1, "pen", 15, 10)));
		order.addItems(new LineItems(1, 3, new Product(2, "Book", 80, 10)));
		order.addItems(new LineItems(1, 3, new Product(2, "Book", 80, 10)));
		customer.addOrder(order);
		printReceipt(customer);
	}
	public static void printReceipt(Customer customer) {
		System.out.println("Customer name is :\t"+customer.getName()+"\nCustomer Location :\t"+customer.getLocation());
		for (Order order : customer.getOrder()) {
			System.out.println("Product Id :\t"+order.getItems().get(1).getProduct().getId());
			System.out.println("Product Name :\t"+order.getItems().get(1).getProduct().getName());
			System.out.println("Product Price :\t"+order.getItems().get(1).getProduct().getCost());
			System.out.println("Product Discount :\t"+order.getItems().get(1).getProduct().getDiscount());
			System.out.println("Product New Price :\t"+order.getItems().get(1).getProduct().calculateDiscountedPrice());
			//System.out.println("Product Id :\t"+order.getItems().get(0).getProduct().getId());
		}
		System.out.println("Total Price :\t"+customer.getOrder().get(0).getTotalprice());
		System.out.println("Total Saving :\t"+customer.getOrder().get(0).getTotalsaving());
	}
}
