package com.singleton.design.pattern.simpleSingleton.single.locking;
// thread safe locking singleton
public class SimpleSingleton4 {
	private static SimpleSingleton4 instance = null;
	
	private SimpleSingleton4() {
		System.out.println(" one constructor is called always ");
	}
	
	public static SimpleSingleton4 getInstance() {
		synchronized(SimpleSingleton4.class) {
			if(instance == null) {
				instance = new SimpleSingleton4();
			}
		}
		return instance;
	}
	public static void main(String[] args) {
		SimpleSingleton4 s1 = SimpleSingleton4.getInstance();
		SimpleSingleton4 s2 = SimpleSingleton4.getInstance();
		SimpleSingleton4 s3 = SimpleSingleton4.getInstance();
		System.out.println(s1 == s2);
		System.out.println(s1 == s3);
	}

}
