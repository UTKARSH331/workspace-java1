package com.product_management;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Customer_Management {
	private  Set<Integer> cId;
	private String name = "Ujawal";
	private String email = "rajutkarsh231@gmail.com";
	private long  mobile = 73526392;
	private String  address  = "BTM";
	public Customer_Management() {
		super();
		this.cId = new HashSet<>();
		this.name = name;
		this.email = email;
		this.mobile = mobile;
		this.address = address;
	}
	public void registerACustomer(int customerId) {
		if(customerId != 0) {
			cId.add(customerId);
			System.out.println("customer id is successfully added");
		}
	}
	public void viewCustomerDetails(int customerId) {
		if(cId.contains(customerId)) {
			//return true;
			System.out.println(" customerId of the customer : " + customerId);
			System.out.println("name of the customer : " + name);
			System.out.println(" email of the customer : " + email);
			System.out.println(" mobile of the customer : " + mobile);
			System.out.println(" addressof the customer : " + address);
						
		}
		System.out.println("customer not found");
		//return false;
	}
	public void searchById(int customerId) {
		if(cId.contains(customerId)) {
			System.out.println(name);
		}
	}
	public void updateCustomerAddress(int customerId, String Address) {
		if(cId.contains(customerId)) {
			
		}
	}
	

}
