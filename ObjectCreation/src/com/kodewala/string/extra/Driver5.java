package com.kodewala.string.extra;

public class Driver5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "Banglore";
		String s2 = new String("Banglore"); // heap + scp
		System.out.println(s1 == s2); // compare the objects address
		System.out.println(s1.equals(s2)); // compares the object content like ( Banglore == Banglore)

	}

}
 