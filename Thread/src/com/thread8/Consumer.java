package com.thread8;

public class Consumer extends Thread {
	Task task;
	public Consumer(Task task) {
		this.task = task;
	}
	public void run() {
		for (int i =0; i<10; i++) {
			try{
				task.consume(i);
				Thread.sleep(2000);			
			} catch (InterruptedException e) {
				// TODO: handle exception
				e.printStackTrace();
			}
		}
	}

}
