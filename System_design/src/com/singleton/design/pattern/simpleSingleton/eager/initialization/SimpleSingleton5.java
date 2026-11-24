package com.singleton.design.pattern.simpleSingleton.eager.initialization;
// eager initialization 


public class SimpleSingleton5 {

	private static SimpleSingleton5 instance = new SimpleSingleton5();
	
	private SimpleSingleton5() {
		System.out.println("constructor is called egerly");
	}
	public static SimpleSingleton5 getInstance () {
		return instance;
	}
	public static void main(String[] args) {
		SimpleSingleton5 s1 = SimpleSingleton5.getInstance();
		SimpleSingleton5 s2 = SimpleSingleton5.getInstance();
		SimpleSingleton5 s3 = SimpleSingleton5.getInstance();
		System.out.println(s1 == s2);
		System.out.println(s1 == s3);
	}
}
