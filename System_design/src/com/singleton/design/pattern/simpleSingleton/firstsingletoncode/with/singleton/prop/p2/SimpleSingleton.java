package com.singleton.design.pattern.simpleSingleton.firstsingletoncode.with.singleton.prop.p2;
/*
 * The purpose of Singleton is to restrict object creation to only one instance. 
 * This code achieves this through a private constructor and a static getInstance() method.
 * but other one not acheived this SimpleSingleTon3
 */
class SimpleSingleton{
	private static SimpleSingleton instance = null;
	
	private SimpleSingleton () {
		System.out.println("Singleton Constructor called");
	}
	public static SimpleSingleton getInstance() {
		if(instance == null) {
			instance = new SimpleSingleton();
		}
		return instance;
	}
	public static void main(String[] args) {
		SimpleSingleton s1 = SimpleSingleton.getInstance();
		SimpleSingleton s2 = SimpleSingleton.getInstance();
		System.out.println(s1 == s2);
		
		SimpleSingleton s3 = SimpleSingleton.getInstance();
		
		SimpleSingleton s4 = SimpleSingleton.getInstance();
		
		System.out.println(s2 == s3);
		
		System.out.println(s3 == s4);
		
		System.out.println(s4 == s1);
	}
	
	
}


