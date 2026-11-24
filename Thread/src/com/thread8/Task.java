package com.thread8;

//lock aquisation and lock release is taken care by jvm that means 
public class Task {
	int data; 
	boolean isDataAvailable = false;
	// produce
	public synchronized void  produce(int _data) throws InterruptedException{
		while(isDataAvailable) {
			System.out.println("[" + Thread.currentThread().getName() + "] is waiting....");
			wait();
		}
		// produced the data
		this.data = _data;
		System.out.println("produced the data : " +data);
		isDataAvailable = true;
		System.out.println("produces notifying the consumer ");
		notify(); // notify the consumer so that the consumer can consume it.
	}
	// consumer
	public synchronized void  consume(int _data) throws InterruptedException{
		while(!isDataAvailable) {
			System.out.println("[" + Thread.currentThread().getName() + "] is waiting....");
			wait();
		}
		
		System.out.println("Consuming  the data : " +data);
		isDataAvailable = false;
		System.out.println("Consumer notifying the Producer  ");
		notify(); //  notify the producer so that producer can generate/produce more data
	}

}
