package com.product_management;

import java.util.ArrayList;
import java.util.List;

public class OrderHistory {
	
	
	private List<OrderManagement> orders = new ArrayList<OrderManagement>();
	
	public void addOrder(OrderManagement order) {
		orders.add(order);
	}
	public void viewOrderHistory(int customerId) {
		for(OrderManagement order : orders) {
			if(order.getCustomerId() == customerId) {
				System.out.println("order Id : " + order.getCustomerId());
				System.out.println("order Date : " + order.getOrderDate());
				System.out.println("order Amount : " + order.getTotalAmount());
				System.out.println("order Status : " + order.getOrderstatus());
				
				System.out.println(".....................");
			}
		}
		//System.out.println("");
	}

}
