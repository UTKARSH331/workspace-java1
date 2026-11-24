package com.singleton.design.pattern.simpleSingleton.p2;

//no singleton

//first code for understanding why singleton is needed of coder army

public class SingletonP3 {
	
	public SingletonP3() {
		
	}
	
	public static void main(String[] args) {
		SingletonP3 s1 = new SingletonP3();
		
		SingletonP3 s2 = new SingletonP3();
		
		SingletonP3 s3 = new SingletonP3();
		
		System.out.println(s1 == s2);
		
		System.out.println(s2 == s3);
	}

}
