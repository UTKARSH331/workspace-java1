package com.thread;

class EmailSender extends Thread{
	public void run() {
		// when thread is in running state -->
		// Thread is doing work/task
		// from running to waiting /blocked
		//once waiting is over thread move to runnable state
		//once cpu allows , thread moved to running state
		// once run method is completed by thread, then it moves to terminated(Dead) state.
		System.out.println("Sending email....." + Thread.currentThread().getName());
	}
}
public class Driver1 {
	public static void main(String[] args) {
		System.out.println(Thread.currentThread().getName());
		// once thread object is created, state = new
		EmailSender t1 = new EmailSender();
		//state = RUNNABLE
		t1.start();// NEW --> RUNNABLE
		t1.start();// Exception in thread "main" java.lang.IllegalThreadStateException // TERMINATED --> X // ONCE CPU GIVES TIME 
		// TO EXECUTE /RUN THEN STATE WILL BE RUNNING .
	}
	

}
