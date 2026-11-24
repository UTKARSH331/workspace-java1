package com.thread9;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class MyThread extends Thread{
	int taskId;
	public MyThread(int taskId) {
		this.taskId = taskId;
	}
	public void run() {
		System.out.println("MyThread.run()...... task is " + taskId + ": [" + Thread.currentThread().getName() + "]");	
	}
}

public class Driver {
	public static void main(String[] args) {
		// we are going to executor service.
		ExecutorService executorService = Executors.newFixedThreadPool(5); // pool of  5 threads
		// excuting 10 tasks
		for(int i = 0; i<10; i++) {
			MyThread tasks = new MyThread(i);
			executorService.execute(tasks);
			
		}
		executorService.shutdown();
	}

}
