package com.techlabs.shoppingcartconsole;

import java.util.Date;

import com.techlabs.shoppingcart.Customer;
import com.techlabs.shoppingcart.LineItems;
import com.techlabs.shoppingcart.Order;
import com.techlabs.shoppingcart.Product;

public class CartDetails {
	private static double totalPrice;
	private static double totalSaving;
	public static void main(String[] args) {
		
		Date date = new Date();
		Customer customer = new Customer("akash", "Dahisar");
		Order order = new Order(date);
		order.addItems(new LineItems(1, 2, new Product(1, "pen", 10, 10)));
		order.addItems(new LineItems(1, 3, new Product(2, "Book", 80, 10)));
		order.addItems(new LineItems(1, 3, new Product(2, "Book", 80, 10)));
		customer.addOrder(order);
		printReceipt(customer);
	}

	public static void printReceipt(Customer customer) {
		System.out.println("Customer name is :\t"+customer.getName()+"\nCustomer Location :\t"+customer.getLocation());
		
		for (Order order : customer.getOrder()) {
			System.out.println("Date :\t"+order.getDate());
			orderDetails(order);
			System.out.println("Total Price Of cart :\t"+totalPrice);
			totalSaving = totalSaving-totalPrice;
			System.out.println("Total Saving:\t"+totalSaving);
		}
	}
	public static void orderDetails(Order order) {
		for(int i = 0;i < order.getItems().size();i++) {
			System.out.println("Product Id :\t"+order.getItems().get(i).getProduct().getId());
			System.out.println("Product Name :\t"+order.getItems().get(i).getProduct().getName());
			System.out.println("Product Quantity :\t"+order.getItems().get(i).getQuantity());
			System.out.println("Product Price :\t"+order.getItems().get(i).getProduct().getCost());
			System.out.println("Product Discount :\t"+order.getItems().get(i).getProduct().getDiscount());
			System.out.println("Product New Price :\t"+order.getItems().get(i).getProduct().calculateDiscountedPrice());
			System.out.println("Item Price :\t"+order.getItems().get(i).calculateLineItemDiscountedPrice());
			totalPrice= totalPrice + order.getItems().get(i).calculateLineItemDiscountedPrice();
			totalSaving = totalSaving + order.getItems().get(i).calculateLineItemActualPrice();
			System.out.println("\n");
			}
	}

}
