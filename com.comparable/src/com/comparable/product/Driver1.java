package com.comparable.product;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.comparator.CustomerById;

public class Driver1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Customer> customers = new ArrayList<Customer>();
		customers.add(new Customer("Aman", 110));
		customers.add(new Customer("Rahul", 1101));
		customers.add(new Customer("Abhinav", 1110));
		customers.add(new Customer("Abhidesh", 11010));
		customers.add(new Customer("Raman", 10));
		
        Collections.sort(customers, new CompareByCustomerId());
        for(int i = 0; i<customers.size(); i++) {
        	Customer c1 = customers.get(i);
        	System.out.println(c1.customerId + " c1.customer Id " + c1.customerName + "c1.customerName");
        }
	}

}
