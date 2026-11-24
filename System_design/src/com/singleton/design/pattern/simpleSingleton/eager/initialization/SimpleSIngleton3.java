package com.singleton.design.pattern.simpleSingleton.eager.initialization;

public class SimpleSIngleton3 {
	
	private static SimpleSIngleton3 instance = new SimpleSIngleton3();
	
	private SimpleSIngleton3() {
		System.out.println("it is example of singleton called by eagerly");
	}
	
	public static SimpleSIngleton3 getInstance() {
		return instance;
	}
	
	public static void main(String[] args) {
		SimpleSIngleton3 s1 = SimpleSIngleton3.getInstance();
		
		SimpleSIngleton3 s2 = SimpleSIngleton3.getInstance();
		
		SimpleSIngleton3 s4 = SimpleSIngleton3.getInstance();
		
		SimpleSIngleton3 s3 = SimpleSIngleton3.getInstance();
		
		System.out.println(s1 == s2);
		
		System.out.println(s2 == s3);
		
		System.out.println(s3 == s4);
		
		System.out.println(s4 == s1);
	}

}
