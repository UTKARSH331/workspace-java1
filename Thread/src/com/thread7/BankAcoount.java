package com.thread7;


public class BankAcoount {
	private int balance = 1000;
	public  void run(BankAcoount receiver, int amount) {
		System.out.println("[" + Thread.currentThread().getName() + "]20 lines sending email notification ..... requsested the fund transfer " );
		synchronized (this) {
			if(balance >= amount) {
				System.out.println("["+Thread.currentThread().getName() + "] checked balance: " + balance);
				try {
					Thread.sleep(400);
					
				} catch (InterruptedException e) {
					// TODO: handle exception
					e.printStackTrace();
				}
				balance = balance - amount;
				receiver.balance = receiver.balance + amount;

				System.out.println("["+Thread.currentThread().getName() + "] transferred " + amount);
			} else {

				System.out.println("["+Thread.currentThread().getName() + "]+ " + "insuffiecient balance ");
			}
			
		}
		System.out.println("[" + Thread.currentThread().getName() + "]20 lines sending email notification ..... completed the fund transfer " );
		
	}

}