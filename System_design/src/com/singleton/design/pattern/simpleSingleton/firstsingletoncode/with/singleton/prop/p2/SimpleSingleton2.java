package com.singleton.design.pattern.simpleSingleton.firstsingletoncode.with.singleton.prop.p2;

// MOSTLY this is rcomandable
// Uses getInstance()
// it controls object creation
// uses getinstance
// private constructor works correctly 
// follow singleton principle correctly

public class SimpleSingleton2 {
	private static SimpleSingleton2 instance = null;
	
	private SimpleSingleton2() {
		System.out.println("only one constructor is called");
	}
	
	public static SimpleSingleton2 getInstance () {
		if (instance == null) {
			instance = new  SimpleSingleton2(); 
		}
		return instance;
	}
	public static void main(String[] args) {
		SimpleSingleton2 I0 = SimpleSingleton2.getInstance();
		SimpleSingleton2 I1 = SimpleSingleton2.getInstance();
		SimpleSingleton2 I2 = SimpleSingleton2.getInstance();
		System.out.println(I0 == I1);
		System.out.println(I1 == I2);
		System.out.println(I0 == I2);
	}

}
