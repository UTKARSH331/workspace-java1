package com.thread.PRINT1to20nos;

class PrintNos extends Thread{
	public void run() {
		for(int i =1; i<=20; i++) {
			System.out.println("print the nos. : " + i + Thread.currentThread().getName() );
		}
	}	
}
public class Driver1 {
	public static void main(String[] args) {
		PrintNos p1 = new PrintNos();
		p1.run();
		PrintNos p2 = new PrintNos();
		p2.start();
	}
}
//jyhgPrintNos
               