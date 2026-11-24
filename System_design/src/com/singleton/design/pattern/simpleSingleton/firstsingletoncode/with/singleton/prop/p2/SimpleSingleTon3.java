package com.singleton.design.pattern.simpleSingleton.firstsingletoncode.with.singleton.prop.p2;

import com.singleton.design.pattern.simpleSingleton.p2.SingletonP3;

// first singleton code is fully functional without thread safety . it has thread safety issues
// this not more insstructable to do bcz it Attempts direct object creation
// Uses new

// cannot executes as written
// Private constructor causes compilation error
public class SimpleSingleTon3 {
	
	private static SimpleSingleTon3 instance = null;
	
	private  SimpleSingleTon3() {
		System.out.println("one object is always created ");
	}
	
	public static SimpleSingleTon3 getInstance() {
		
		if(instance == null) {
			 instance = new SimpleSingleTon3();
		}
		return instance;
		
	}
	
	public static void main(String[] args) {
		SimpleSingleTon3 s1 = new SimpleSingleTon3();
		
		SimpleSingleTon3 s2 = new SimpleSingleTon3();
		
		
		SimpleSingleTon3 s3 = new SimpleSingleTon3();
		
		System.out.println(s1.getInstance() == s2.getInstance());
		
		System.out.println(s2.getInstance() == s3.getInstance());
		
		System.out.println(s3.getInstance() == s1.getInstance());
	}

}
