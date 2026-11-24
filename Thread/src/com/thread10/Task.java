package com.thread10;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Task implements Callable<String> {
	
	SendEmail emailsender;
	

	public Task(SendEmail _e1) {
		super(); 
		this.emailsender = _e1;
	}
	// collab with future 
	// understanding blocking
	// thread pool 


	@Override
	public String call() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Executing call()");
		return emailsender.sendEmail(emailsender.body, emailsender.email) ;
		
	}
	
	public static void main(String[] args) {
		
	ExecutorService ex1 = Executors.newFixedThreadPool(5);
	for (int i =0; i<10; i++) {
		SendEmail e1 = new SendEmail();
		Task t1 = new Task(ex1);
		Future<String> f1 = ex1.submit(t1);
		System.out.println("it return in string in future " + f1);
		
	}
		
	}

}
