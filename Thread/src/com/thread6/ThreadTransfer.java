package com.thread6;

public class ThreadTransfer extends Thread{
	private BankAcoount sender;
	private BankAcoount receiver;
	public ThreadTransfer(BankAcoount sender, BankAcoount receiver) {
		this.sender = sender;
		this.receiver = receiver;
	}
	public void run() {
		sender.doTransfer(receiver, 600);
	}
}
