package com.rehashing.product;

import java.util.HashSet;
import java.util.Set;

public class Driver1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<String> products = new HashSet<String>(32, 0.75f, true);
		products.add("1");
		products.add("2");
		products.add("3");
		products.add("4");
		products.add("5");
		products.add("6");
		products.add("7");
		products.add("8");
		products.add("9");
		products.add("10");
		products.add("11");
		products.add("12");
		products.add("A");
		//products.add("14");
		System.out.println(products);

	}

}
