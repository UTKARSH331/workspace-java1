package com.generic;

public class Driver6 {


	    public static void main(String[] args) {
	        Box1<Integer> b1 = new Box1<>();
	        b1.value = 5;
	        b1.printDouble();
	    }
	}
	// Generics --> T can be anything
	// Bounds in Generics
	// Upper bound --> T is atleast Number or its subtype

	class Box1<T extends Number> {
	    T value;

	    public void printDouble() {
	        System.out.println(value.doubleValue());
	    }
	}
	

