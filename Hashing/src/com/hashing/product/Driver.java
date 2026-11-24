package com.hashing.product;

import java.util.HashSet;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//HashSet< String> set = new HashSet<String>();
		int hash = "BLR".hashCode();
		System.out.println(hash+ "hashCode is here....");
		int BucketNo = hash & (16 -1);
		System.out.println(BucketNo);
		

	}

}
