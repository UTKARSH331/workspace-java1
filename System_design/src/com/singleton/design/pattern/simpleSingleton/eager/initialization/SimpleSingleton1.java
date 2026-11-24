package com.singleton.design.pattern.simpleSingleton.eager.initialization;

public class SimpleSingleton1 {
	
	private static SimpleSingleton1 instance = new SimpleSingleton1();
	
	private SimpleSingleton1() {
		System.out.println("it is called eagerlyS");
	}
	public static SimpleSingleton1 getInsatnce() {
		return instance;
	}
	
	public static void main(String[] args) {
		SimpleSingleton1 s1 = SimpleSingleton1.getInsatnce();
		
		SimpleSingleton1 s2 = SimpleSingleton1.getInsatnce();
		
		SimpleSingleton1 s3 = SimpleSingleton1.getInsatnce();
		
		System.out.println(s1 == s2);
		
		System.out.println(s2 == s3);
		
		System.out.println(s1 == s3);
	}

}
