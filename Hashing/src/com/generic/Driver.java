package com.generic;

class Pair<T>{
	T first;
	T second;
	public Pair(T first, T second) {
		super();
		this.first = first;
		this.second = second;
	}
	
}

//generic type
public class Driver {

	public static void main(String[] args) {
		Pair<Integer> p1 = new Pair(1, 21);
		System.out.println(p1.first + "," + p1.second);
	}
	
}
