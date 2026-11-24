package com.singleton.design.pattern.simpleSingleton.p2;
// no singleton

// first code for understanding why singleton is needed of coder army
public class SimpleSingleTon6 {
	//int instance;
	public SimpleSingleTon6() {
	//	this.instance = instance;
	}
	public static void main(String[] args) {
		SimpleSingleTon6 s1 = new SimpleSingleTon6();
		SimpleSingleTon6 s2 = new SimpleSingleTon6();
		SimpleSingleTon6 s3 = new SimpleSingleTon6();
		System.out.println(s1 == s3) ;
		System.out.println(s1 == s2);
	}

}
