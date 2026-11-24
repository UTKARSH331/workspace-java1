package com.hashset.spreadhash;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int hash = "BLR".hashCode();
		int spreadHash = hash ^(hash >>> 16);
		int bucket = spreadHash & (hash - 1);
		System.out.println("bucket...." + bucket);
	}
}
