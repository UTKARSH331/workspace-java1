package com.hash.map.compareandset;

import java.util.concurrent.atomic.AtomicInteger;

public class Driver {
	public static void main(String[] args) {
		AtomicInteger a1 = new AtomicInteger(10);
		boolean result = a1.compareAndSet(10, 20);
		System.out.println("result :" + result);
		System.out.println(a1.get() + " : a1.get");
	}

}
