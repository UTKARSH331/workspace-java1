package com.hashcode;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "Hello";
		System.out.println("hascode (it can be positive or negative ) : " + s1.hashCode());

		String s2 = "Hello";
		System.out.println("hascode (it can be positive or negative ) : " + s1.hashCode());
		System.out.println("is s1 and s2 are equal " + s1.equals(s2));
 
		Driver d1 = new Driver();
		Driver d2 = new Driver();
		System.out.println(d1.hashCode() + "and " + d2.hashCode());
		System.out.println("is d1 and d2 are equal " + d1.equals(d2));
	}

}
