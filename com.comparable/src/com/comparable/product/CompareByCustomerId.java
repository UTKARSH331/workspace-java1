package com.comparable.product;

import java.util.Comparator;

public class CompareByCustomerId implements Comparator<Customer>{

	@Override
	public int compare(Customer o1, Customer o2) {
		// TODO Auto-generated method stub
		int result = o1.customerName.compareTo(o2.customerName);
		return result;
	}

}
