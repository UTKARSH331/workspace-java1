package com.hashset.hashcode.check;

import java.util.HashSet;
import java.util.Set;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<String> set = new HashSet<String>();
        set.add("BLR");
        int hash = "BLR".hashCode();
        int bucket = hash & (16-1);
        System.out.println("bucket is ..." +  bucket);
        System.out.println(hash);
	}

}
