package com.hashing.product;

import java.util.HashSet;

public class Product {

	public static void main(String[] args) {
		HashSet<String> product = new HashSet<String>();
		product.add("iphone17");
		product.add("Samsung");
		product.add("lg23");
		product.add("mac-pro324");
		int hash = "mac-pro324".hashCode();
		int spreadHash = hash ^ (hash >>> 16);
		int bucketNumber = spreadHash & 15;
		System.out.println("bucket number is " + bucketNumber);
	}
}
