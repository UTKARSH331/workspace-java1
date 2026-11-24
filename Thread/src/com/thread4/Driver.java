package com.thread4;

class Task{
	public synchronized  void printNumbers() {
		for(int i =0; i<10; i++) {
			System.out.println("printing  " + i + " [" +Thread.currentThread().getName() + "]");
		}
	}
}

class PrinterThread extends Thread{
	Task task;
	public PrinterThread(Task _task) {
		this.task = _task;
	}
	public void run() {
		task.printNumbers();
	}
}

public class Driver {
	public static void main(String[] args) {
		Task task1 = new Task();
		PrinterThread p1 = new PrinterThread(task1);
		p1.setName("FirstThread");
		p1.start();
		
		PrinterThread p2 = new PrinterThread(task1);
		p2.setName("2ndThread");
		p2.start();
	}

}
