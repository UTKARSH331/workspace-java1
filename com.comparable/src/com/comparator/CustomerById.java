package com.comparator;

import java.util.Comparator;

public class CustomerById  implements Comparator<Customer>{
	@Override
	public int compare(Customer c1, Customer c2) {
		int result = Integer.compare(c1.customerid, c2.customerid);
		return result;
	}
}
