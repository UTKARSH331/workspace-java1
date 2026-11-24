package com.thread8;

public class Produce extends Thread {
	Task task;
	public Produce(Task task) {
		super();
		this.task = task;
	}
	public void run() {
		for(int i =0; i<10; i++) {
			try {
				Thread.sleep(2000);
				task.produce(i);
				
			} catch (InterruptedException e) {
				// TODO: handle exception
				e.printStackTrace();
			}
		}
	}

}
