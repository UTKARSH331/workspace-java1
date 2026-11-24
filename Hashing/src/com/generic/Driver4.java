package com.generic;

public class Driver4 {
	
	public static void main(String[] args) {
		Box<Integer> b1 = new Box<>();
		b1.value = 5;
		b1.printDoublevalue();
	}
}
class Box <T extends Number>{
	T value;
	public void printDoublevalue() {
		System.out.println(value.doubleValue());
	}
	
}
