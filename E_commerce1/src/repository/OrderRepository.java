package repository;

import java.util.ArrayList;
import java.util.List;

import Models.Order;

public class OrderRepository {
	private List<Order> orders = new ArrayList<>();
	
	public void save(Order order) {
		orders.add(order);
	}
	 public Order findById(int orderId) {
		 return orders.stream().filter( o -> o.getOrderId() == orderId).findFirst().orElse(null);
	 }
	 public Order findByCustomerId(int customerId) {
		 return orders.stream().filter(c -> c.getCustomerId() == customerId ).findFirst().orElse(null);
	 }
	 public List<Order > getAllOrders(){
		 return orders;
	 }
	 

}
