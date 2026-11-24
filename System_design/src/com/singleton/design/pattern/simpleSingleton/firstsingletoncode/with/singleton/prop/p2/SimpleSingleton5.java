package com.singleton.design.pattern.simpleSingleton.firstsingletoncode.with.singleton.prop.p2;

public class SimpleSingleton5 {
	
	private static SimpleSingleton5 instance = null;
	
	private SimpleSingleton5() {
		System.out.println("only one object is created");
	}
	
	public static SimpleSingleton5 getInstance() {
		if(instance == null) {
			instance = new SimpleSingleton5();
		}
		return instance;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SimpleSingleton5 s1 =  SimpleSingleton5.getInstance();
		
		SimpleSingleton5 s2 = SimpleSingleton5.getInstance();
		
		SimpleSingleton5 s3 = SimpleSingleton5.getInstance();
		
		
		System.out.println(s1 == s2);
        
		System.out.println(s2 == s3);
		
		System.out.println(s3 == s1);
	}

}
