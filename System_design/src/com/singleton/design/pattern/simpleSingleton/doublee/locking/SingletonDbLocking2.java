package com.singleton.design.pattern.simpleSingleton.doublee.locking;

public class SingletonDbLocking2 {
	
	private static SingletonDbLocking2 instance = null;
	
	private SingletonDbLocking2() {
		System.out.println("it is dbLocking syatem");
	}
	
	public static SingletonDbLocking2 getInstance() {
		if(instance == null) {
			synchronized(SingletonDbLocking2.class) {
				if(instance == null) {
					instance = new SingletonDbLocking2();
				}
			}
		}
		return instance;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SingletonDbLocking2 s1 = SingletonDbLocking2.getInstance();
		
		
		SingletonDbLocking2 s2 = SingletonDbLocking2.getInstance();
		
		SingletonDbLocking2 s3 = SingletonDbLocking2.getInstance();
		
		SingletonDbLocking2 s4 = SingletonDbLocking2.getInstance();
		
		System.out.println(s1 == s2);
		
		System.out.println(s2 == s3);
		
		System.out.println(s3 == s4);
		
		System.out.println(s4 == s1);

	}

}
