package com.thread7;

public class BankAccount {
	private  int balance= 1000;
	public   void transfer(BankAccount reciever, int Amount) {
		synchronized (this) {
			if(balance > Amount) {
				System.out.println("[" + Thread.currentThread().getName() + "] 20 lines of codes");
				try {
					Thread.sleep(20000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
					balance = balance-Amount;
					reciever.balance = reciever.balance + Amount; 
					System.out.println("[" + Thread.currentThread().getName() + "] threads transfered" + Amount);
				}else {
					System.out.println("[ " + Thread.currentThread().getName() + "] insuffiencient funds");
				}		
		}
		System.out.println("[" + Thread.currentThread().getName() + "] 20 lines of codes");
	}
}


