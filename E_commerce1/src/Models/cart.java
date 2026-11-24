package Models;

import java.util.ArrayList;
import java.util.List;

public class cart {
	private int customerId;
	private List<CartItem> items = new ArrayList<CartItem>();
	public cart(int customerId) {
		super();
		this.customerId = customerId;
	}
	public int getCustomerId() {
		return customerId;
	}
	
	public List<CartItem> getItems() {
		return items;
	}
	public double getTotalPrices() {
		return items.stream().mapToDouble(CartItem :: getTotalPrice).sum();
	}

}
