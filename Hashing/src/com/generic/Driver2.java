package com.generic;

class Pair1<T , U>{
	T first;
	U second;
	public Pair1(T first, U second) {
		super();
		this.first = first;
		this.second = second;
	}
	
}

//generic type with two T , U
public class Driver2 {

	public static void main(String[] args) {
		Pair1<Integer, String> p1 = new Pair1<Integer, String>(1, "Aditya");
		System.out.println(p1.first + "," + p1.second);
	}
	
}
