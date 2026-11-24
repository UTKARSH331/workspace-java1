package com.product_management;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.product_management.Product_Management.Product;

public class ShoppingCart {
	
	 List<CartItem> items = new ArrayList<ShoppingCart.CartItem>();
	class CartItem{
		private int productId;
		private Product product;
		private String productName;
		private int price;
		private int quantity;
		private int totalprice;
		public CartItem(int productId,Product product, String productName, int price, int quantity) {
			super();
			this.productId = productId;
			
			this.productName = productName;
			this.price = price;
			this.quantity = quantity;
			this.totalprice = price * quantity;
			
		}
		public Product getProduct() {
		    return product;
		}
		  public void increaseQuantity() {
	            quantity++;
	            totalprice = price * quantity;
	        }
		  public void decreaseQuantity() {
			  quantity--;
			  totalprice = price * quantity;
		  }
		  public void allDetails() {
			  System.out.println("productId : " + productId);
			  System.out.println("productName : " + productName);
			  System.out.println("price : " + price);
			  System.out.println("quantity : " + quantity);
			  System.out.println("totalprice : " + totalprice);
		  }
		  public int getQuantity() {
			    return quantity;
			}
		
	}
	public void addProduct(int productId, String productName,int price, int quantity ) {
		CartItem item = new CartItem(productId, null, productName, price, quantity);
		items.add(item);
	}
	public void productRemoval(int productId1) {
	Iterator<CartItem> iterator = items.iterator();
	while(iterator.hasNext()) {
		CartItem item = iterator.next();
		if(item.productId == productId1) {
			iterator.remove();
			break;
		}
	}
	
	}
	public void increaseProductQuantity(int productId) {
		for(CartItem item : items) {
			if(item.productId == productId) {
				item.increaseQuantity();
				break;
			}
		}
	}
	
	public void decreaseProductQuantity(int productId) {
		for(CartItem item : items) {
			if(item.productId == productId) {
				item.decreaseQuantity();
				break;
			}
		}
	}
	public void viewdetailsInCart(int productId) {
		for(CartItem item : items) {
			if(item.productId == productId) {
				item.allDetails();
				break;
			}
		}
	}
	public int  calculateTotalPriceOfCart() {
		int totalprice = 0;
		for(CartItem item : items) {
			totalprice = totalprice + item.totalprice;
		}
		return totalprice;
	}
	public void clearCart() {
		items.clear();
	}
}
