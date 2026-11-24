package com.runnable;

class Task implements Runnable{
	public void run() {
		System.out.println("Task.run()" + Thread.currentThread().getName());
	}
}
// runnable is better than thread bcz it extends also it supports like multiple inheritance 
public class Driver {
	public static void main(String[] args) {
		Task task = new Task();
		Thread t1 = new Thread(task);
		t1.start();
		System.out.println("Driver.main() End ");
	}

}
