package com.comparator;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/*
class Product {
	String productName;
	int productId;
	public Product(String productName, int productId) {
		super();
		this.productName = productName;
		this.productId = productId;
	}
}
*/
public class Driver1 {
public static void main(String[] args) {
	Customer customer = new Customer(121, "rahul");
	Customer customer1 = new Customer(12221, "aman");
	Customer customer2 = new Customer(1331, "UTk");
	List<Customer> c11 = new ArrayList<Customer>();
	c11.add(customer);
	c11.add(customer1);
	c11.add(customer2);
	Collections.sort(c11, new CustomerById());
	for (Customer c1 : c11) {
		System.out.println(c1.customerid + c1.customerName);
	}
	
	
}
	
}
