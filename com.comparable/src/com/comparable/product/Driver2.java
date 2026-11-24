package com.comparable.product;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Product implements Comparable<Product>{
	 String productName;
	 int productId;

	public Product(String productName, int productId) {
		this.productName = productName;
		this.productId = productId;
	}

	@Override
	public int compareTo(Product o) {
		int result = Integer.compare(o.productId, o.productId);
		
		int j = Integer.hashCode(result);
		return result;
	}
}
public class Driver2 {
   public static void main(String[] args) {
	    Product p1 = new Product("iphone12", 120);
	       Product p2 = new Product("Samsung", 1001);
	       Product p3 = new Product("gpay", 1201);
	       Product p4 = new Product("Alto", 101);
	       
	       List<Product> products = new ArrayList<Product>();
	       products.add(p1);
	       products.add(p2);
	       products.add(p4);
	       products.add(p3);
	       Collections.sort(products);
	       
	       for (int i = 0; i<products.size(); i++) {
	    	   Product p = products.get(i);
	    	   System.out.println(p.productName + " " + p.productId);
	       }
}
       
}

