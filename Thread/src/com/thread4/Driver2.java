package com.thread4;

class print{
	public void run() {
		for (int i =0; i<10; i++) {
			System.out.println("printing " + i + Thread.currentThread().getName());
		}
	}
}
class PrintNos extends Thread{
	print t1;
	public PrintNos(print _t1) {
		this.t1 = _t1;
	}
	public void printThreads() {
		t1.run();
	}
}

public class Driver2 {
	public static void main(String[] args) {
		print p2 = new print();
		PrintNos printnos = new PrintNos(p2);
		printnos.setName("2ndName");
		printnos.start();
		print p1 = new print();
		PrintNos printnos1 = new PrintNos(p1);
		printnos1.setName("FirstName");
		printnos1.start();		
	}

}
