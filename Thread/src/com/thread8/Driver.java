package com.thread8;

public class Driver {
	
	public static void main(String[] args) {
		Task t1 = new Task();
		
		Consumer c1 = new Consumer(t1);
		Produce p1 = new Produce(t1);
		
		p1.setName("producer");
		c1.setName("consumer");
		
		p1.start();
		c1.start();
	}
}
