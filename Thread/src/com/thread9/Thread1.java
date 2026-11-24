package com.thread9;

public class Thread1 extends Thread {
	int a = 10;
	int b = 5;
	
	@Override
	public void run() {
		int sum = a+b;
		System.out.println("[" +  Thread.currentThread().getName() + "]" + sum );
	}

}

class Driver2{
	public static void main(String[] args) {
		Thread1 t1 = new Thread1();
		t1.start();
	}
}
