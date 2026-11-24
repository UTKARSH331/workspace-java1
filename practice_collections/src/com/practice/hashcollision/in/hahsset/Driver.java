package com.practice.hashcollision.in.hahsset;

import java.util.HashSet;
import java.util.Set;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set< String > set = new HashSet<String>();
		set.add("AAA");
		set.add("MMI");
		set.add("DLH");
		set.add("RCI");
		set.add("PNBE");
		set.add("DLH");
		set.add("JPR");
		set.add("BLR");
		int hash = "BLR".hashCode();
		
		System.out.println("hashcode for the BLR: " + hash);
		// syso("XYZ hashcode started ");
		set.add("XYZ");
		int hash2 = "XYZ".hashCode();
		System.out.println(hash2 + "hash2 for the XYZ");
		int spreadHash = hash ^ (hash >>> 16);
		int bucketNO = spreadHash & (15);
        System.out.println("bucketNO is ...." + bucketNO);
        int hash1 = "AAA".hashCode();
        System.out.println("hahscode for the AAA : " + hash1);
	}

}
