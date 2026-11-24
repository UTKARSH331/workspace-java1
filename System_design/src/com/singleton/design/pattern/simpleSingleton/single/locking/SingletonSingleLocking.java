package com.singleton.design.pattern.simpleSingleton.single.locking;

public class SingletonSingleLocking {
	
	private static SingletonSingleLocking instance = null;
	
	private SingletonSingleLocking() {
		System.out.println("it is a single locking");
	}
	
	public static SingletonSingleLocking getInstance() {
		synchronized(SingletonSingleLocking.class) {
			if(instance == null) {
				instance = new SingletonSingleLocking();
			}
		}
		return instance;
	}
	
	public static void main(String[] args) {
		 SingletonSingleLocking s1 = SingletonSingleLocking.getInstance();
		 
		 SingletonSingleLocking s2 = SingletonSingleLocking.getInstance();
		 
		 SingletonSingleLocking s3 = SingletonSingleLocking.getInstance();
		 
		 System.out.println(s1 == s2);
		 
		 System.out.println(s2 == s3);
		 
		 System.out.println(s3 == s1);
	}

}
