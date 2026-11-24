package com.singleton.design.pattern.simpleSingleton.single.locking;

public class SingletonSingleLocking2 
{
     private static SingletonSingleLocking2 instance = null;
     
     private SingletonSingleLocking2() {
    	 System.out.println(" it is a single locking in singleton");
     }
     
     public static SingletonSingleLocking2 getInstance() {
    	 synchronized(SingletonSingleLocking2.class) {
    		 if(instance == null) {
    			 instance = new SingletonSingleLocking2();
    		 }
    	 }
		 return instance;
     }
     public static void main(String[] args) {
		SingletonSingleLocking2 s1 = SingletonSingleLocking2.getInstance();
		
		SingletonSingleLocking2 s2 = SingletonSingleLocking2.getInstance();
		
		SingletonSingleLocking2 s3 = SingletonSingleLocking2.getInstance();
		
		
		SingletonSingleLocking2  s4 = SingletonSingleLocking2.getInstance();
		
		System.out.println(s1 == s2);
		
		System.out.println(s2 == s3);
		
System.out.println(s4 == s2);
		
		System.out.println(s4 == s1);
	}
}
