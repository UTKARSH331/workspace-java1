package Models;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Order {
	private int orderId;
	private int customerId;
	private List<CartItem> items;
	private double totalAmount;
	private OrderStatus orderstatus;
	private LocalDateTime orderDate;
	public Order(int orderId, int customerId, List<CartItem> items, double totalAmount, OrderStatus orderstatus,
			LocalDateTime orderDate) {
		super();
		this.orderId = orderId;
		this.customerId = customerId;
		this.items = new ArrayList<CartItem>(items);
		this.totalAmount = totalAmount;
		this.orderstatus = OrderStatus.PLACED;
		this.orderDate = LocalDateTime.now();
	}
	public int getOrderId() {
		return orderId;
	}

	public int getCustomerId() {
		return customerId;
	}
	
	public List<CartItem> getItems() {
		return items;
	}
	
	public double getTotalAmount() {
		return totalAmount;
	}
	
	public OrderStatus getOrderstatus() {
		return orderstatus;
	}
	public void setOrderstatus(OrderStatus orderstatus) {
		this.orderstatus = orderstatus;
	}
	public LocalDateTime getOrderDate() {
		return orderDate;
	}
	public String toString() {
		return "Order ID     : " + orderId +
                "\nCustomer ID  : " + customerId +
                "\nOrder Date   : " + orderDate +
                "\nAmount       : ₹" + totalAmount +
                "\nStatus       : " + orderstatus;
	}
	

}
