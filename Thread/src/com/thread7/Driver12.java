package com.thread7;

 class BankAccount12 extends Thread{
	private static int balance= 1000;
	public  static void transfer(BankAccount12 reciever, int Amount) {
	//	synchronized (this) {
			if(balance > Amount) {
				System.out.println("[" + Thread.currentThread().getName() + "] 20 lines of codes");
				try {
					Thread.sleep(50000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
					balance = balance-Amount;
					reciever.balance = reciever.balance + Amount; 
					System.out.println("[" + Thread.currentThread().getName() + "] threads transfered" + Amount);
				}else {
					System.out.println("[ " + Thread.currentThread().getName() + "] insuffiencient funds");
				}		
		//}
		System.out.println("[" + Thread.currentThread().getName() + "] 20 lines of codes");
	}
	public int getbalance() {
		return balance;
	}
	
}
class Driver12{
	public static void main(String[] args) {
		BankAccount12 acc1 = new BankAccount12();
		acc1.transfer(null, 200);
		Thread t1 = new Thread(acc1);
		t1.start();
	}
}


