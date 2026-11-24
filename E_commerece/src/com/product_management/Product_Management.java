package com.product_management;

import java.util.ArrayList;

import java.util.List;
import java.util.jar.Attributes.Name;

import com.product_management.ShoppingCart.CartItem;

public class Product_Management {
	//OrderManagement o1;
	List<Product> s1 = new ArrayList<Product_Management.Product>();
	private int totalAmount;
	private OrderStatus orderStatus;
	
	class Product{
		private int productId ;
		private String productName ;
		private String category ;
		private int price ;
		private int quantity ;
		private String brand;
		public Product(int productId,String productName, String category,
                int price, int quantity, String brand) {
			super();
			this.productId = productId;
			this.productName = productName;
			this.category = category;
			this.price = price;
			this.quantity = quantity;
			this.brand = brand;
		}
		public int getProductId() {
	        return productId;
	    }
		public boolean checkStock(int requestQuantity) {
			return quantity >= requestQuantity;
		}
		public void reduceStock(int requestQuantity) {
			quantity = quantity - requestQuantity;
		}
		public int getQuality() {
			return quantity;
		}
		public String getBrand() {
			// TODO Auto-generated method stub
			return brand;
		}
		public double getPrice() {
			// TODO Auto-generated method stub
			return price;
		}
		public String getCategory() {
			// TODO Auto-generated method stub
			return category;
		}
		public String getName() {
			// TODO Auto-generated method stub
			return productName;
		}
	}
	
	public boolean checkInventory(ShoppingCart s1) {
		for (CartItem item : s1.items) {
			Product product = item.getProduct();
			 int  requestQuantity  = item.getQuantity();
			 if(!product.checkStock(requestQuantity)) {
				 System.out.println("insufficient stock for product : " + product.getProductId());
				 return false;
			 }
		}
		return true;
	}
	public void reduceInventory(ShoppingCart s1) {
		for (CartItem item : s1.items) {
			Product product = item.getProduct();
			product.reduceStock(item.getQuantity());
		}
	}
	
	
	public void placeOrder(ShoppingCart s1, Product_Management inventory) {
		if(s1.items.isEmpty()) {
			System.out.println("cart is empty");
			return;
		}
		if(!inventory.checkInventory(s1)) {
			return ;
		}
		
		int total = s1.calculateTotalPriceOfCart();
		inventory.reduceInventory(s1);
		//OrderManagement o1 = new OrderManagement(total, s1);
		 this.totalAmount = s1.calculateTotalPriceOfCart();
		    this.orderStatus = OrderStatus.PLACED;
		    System.out.println("order is placed successfully");
		    System.out.println("Total amount : " + total);
		    
		    s1.clearCart();
	}
	

}
