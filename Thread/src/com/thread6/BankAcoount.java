package com.thread6;

public class BankAcoount {
	private int balance = 1000;
	public synchronized void run(BankAcoount receiver, int amount) {
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
	public int getbalance() {
		return balance;
	}

}
