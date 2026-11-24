package com.thread6;

public class BankDemo {
	public static void main(String[] args)  throws InterruptedException{
		BankAcoount acc1 = new BankAcoount();
		BankAcoount acc2 = new BankAcoount();
		
		ThreadTransfer phonepe =  new ThreadTransfer(acc1, acc2);
		Thread gpay = new ThreadTransfer2(acc1, acc2);
		
		phonepe.start();
		
		gpay.start();
		System.out.println("Account 1: " + acc1.getbalance());
		System.out.println("Account 2: " + acc2.getbalance());
	}

}
