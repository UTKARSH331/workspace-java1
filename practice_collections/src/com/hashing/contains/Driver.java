package com.hashing.contains;

import java.util.HashSet;
import java.util.Set;

public class Driver {
	public static void main(String args[]) {
		Set<String> set = new HashSet<String>();
		set.add("BLR");
		set.add("CHE");
		set.add("PNBE");
		set.add("AAA");
		set.add("XYZ");
		set.add("WER");
		System.out.println(set);
		System.out.println(set.contains("AAA"));
		
	}

}
