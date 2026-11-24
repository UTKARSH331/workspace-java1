package com.singleton.design.pattern.simpleSingleton.doublee.locking;
// double thtead safety here considered 
public class SimpleSingleton3 {
	private static SimpleSingleton3 instance = null;
	private SimpleSingleton3() {
		System.out.println("only one object is created");
	}
	public static SimpleSingleton3 getInstance() {
		if(instance == null) {
			synchronized(SimpleSingleton3.class) {
				if(instance == null) {
					instance = new SimpleSingleton3();
				}
			}
		}
		return instance;
	}
	public static void main(String[] args) {
		SimpleSingleton3 s1 = SimpleSingleton3.getInstance();
		SimpleSingleton3 s2 = SimpleSingleton3.getInstance();
		SimpleSingleton3 s3 = SimpleSingleton3.getInstance();
		System.out.println(s1 == s3);
		System.out.println(s1 == s2);
	}

}
