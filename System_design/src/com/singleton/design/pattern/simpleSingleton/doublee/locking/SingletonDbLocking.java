package com.singleton.design.pattern.simpleSingleton.doublee.locking;

public class SingletonDbLocking {
	
	private static SingletonDbLocking instance = null;
	
	private SingletonDbLocking() {
		System.out.println("singleton double locking");
	}
	
	public static  SingletonDbLocking getInstance() {
		if(instance == null) {
			synchronized(SingletonDbLocking.class) {
				if(instance == null) {
					instance = new SingletonDbLocking();
				}
			}
			//return instance;
		}
		return instance;
	}
	
	public static void main(String[] args) {
		SingletonDbLocking s1 = SingletonDbLocking.getInstance();
		
		SingletonDbLocking s2 = SingletonDbLocking.getInstance();
		
		SingletonDbLocking s3 = SingletonDbLocking.getInstance();
		
		System.out.println(s1 == s2);
		
		System.out.println(s2 == s3 );
		
		System.out.println(s3 == s1 );
	}

}
