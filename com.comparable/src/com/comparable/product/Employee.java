package com.comparable.product;

import java.util.Comparator;

public class Employee implements Comparator<Customer>{
	public int compare(Customer a1, Customer a2) {
		int result = a1.customerName.compareTo(a2.customerName);
		return result;
	}
	public int compare(Customer s1, Customer s2, Customer s3) {
		int result = s1.customerName.compareTo(s2.customerName);
		return result;
	}
	public int compareTo(Customer d1, Customer d2 , Customer d4, Customer d5) {
		int result = d1.customerName.compareTo(d2.customerName);
		
		return result;
	}

}


