package com.thread5;

class Task1{
	public void printNo() {
		for (int i = 0; i<10; i++) {
			System.out.println("printing i " +i + Thread.currentThread().getName());
		}		
	}
}

class GetPrintNos extends Thread{
	Task1 task;
	public GetPrintNos(Task1 _task) {
		this.task = _task;
	}
	@Override
	public void run() {
		task.printNo();
	}
}
public class Driver2 {
	public static void main(String[] args) {
		Task1 t1 = new Task1();
		GetPrintNos g1 = new GetPrintNos(t1);
		g1.setName("First Object"); // Donny
		//g1.run();
		System.out.println("start 1st obj thread from here ");
		g1.start();
		System.out.println("end 1st obj thread from here ");
		Task1 t2 = new Task1();
		
		
		GetPrintNos g2 = new GetPrintNos(t2);
		g2.setName("2nd object");
		//g2.run();
		System.out.println("start 2nd obj thread from here ");
		g2.start();
		System.out.println("end 2nd obj thread from here ");
		
	}

}
