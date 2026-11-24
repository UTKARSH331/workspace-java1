package com.product_management;

import java.util.ArrayList;
import java.util.List;

import com.product_management.ShoppingCart.CartItem;

public class OrderManagement {
	private int orderId ;
	private int customerId ;
	private List<CartItem> lc ;
	private int totalAmount ;
	private OrderStatus orderStatus ;
	private int orderDate ;
	private static int nextOrderId = 1000;
	public OrderManagement(int customerId, ShoppingCart  s1) {
		super();
		this.orderId = GenerateaUniqueOrderID();
		this.customerId = customerId;
		this.lc = new ArrayList<ShoppingCart.CartItem>(s1.items);
		this.totalAmount = s1.calculateTotalPriceOfCart();
		this.orderStatus = orderStatus;
		this.orderDate = 2026;
	}
	public OrderStatus getOrderstatus() {
		return orderStatus;
	}
	public int getOrderId() {
		return orderId;
	}
	public int getCustomerId() {
		return customerId;
	}
	public int getTotalAmount() {
		return totalAmount;
		
	}
	public OrderStatus orderstatus() {
		return orderStatus;
	}
	public int getOrderDate() {
		return orderDate;
	}
	public void placeOrder(ShoppingCart s1) {
		//ShoppingCart s1 = new ShoppingCart();
		if(s1.items.isEmpty()) {
			System.out.println("cart is empty");
			return;
		}
		int total = s1.calculateTotalPriceOfCart();
		System.out.println(OrderStatus.PLACED);
		System.out.println("order placed : " + total);
		System.out.println("Order ID : " + orderId);
		System.out.println("Customer ID : " + customerId);
		s1.clearCart();
	}
	public int GenerateaUniqueOrderID() {
		return nextOrderId++;
		
	}
	public void viewOrderDetails() {
	    System.out.println("Order ID : " + orderId);
	    System.out.println("Customer ID : " + customerId);
	    System.out.println("Total Amount : " + totalAmount);
	    System.out.println("Order Status : " + orderStatus);
	    System.out.println("Order Date : " + orderDate);

	    System.out.println("Products :");

	    for (CartItem item : lc) {
	        System.out.println(item);
	    }
	}
	
	public void cancelOrder() {
		if(orderStatus.equals(OrderStatus.PLACED) || orderStatus.equals(OrderStatus.CONFIRMED)) {
			orderStatus = OrderStatus.CANCELLED;
			System.out.println("order is successfully canceled");
		} else {
			System.out.println("order is not cancelled");
		}
	}
	
}
