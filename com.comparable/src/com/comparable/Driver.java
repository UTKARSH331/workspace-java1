package com.comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Product implements Comparable<Product>{
	String productName;
	int productId;
	public Product(String productName, int productId) {
		super();
		this.productId = productId;
		this.productName = productName;
	}
	@Override
	public int compareTo(Product o)  {
		int result = Integer.compare(this.productId, o.productId);
		if(result == 0) {
			return this.productName.compareTo(o.productName);
		}
		return result;
	}
	public void display() {
		System.out.println("salary is " + productId);
		System.out.println("name is " + productName);
		System.out.println("end  is .....");
	}
}

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Product p1 = new Product("Iphone17", 1010);
		Product p2 = new Product("Samsung_20" , 121);
		Product p3 = new Product("realme", 1100);
		Product p4 = new Product("OPPO", 1210);
		
		List<Product> products = new ArrayList<Product>();
		products.add(p4);
		products.add(p1);
		products.add(p3);
		products.add(p2);
		Collections.sort((List<Product>) products);
		for (Product p : products) {
			p.display();
		}
	}
}
