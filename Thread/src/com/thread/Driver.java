package com.thread;

class MyTHread extends Thread{
	@Override
	public void run() {
		System.out.println("Executing run method.....");
		System.out.println("MyThread : This code is executed by [" + Thread.currentThread().getName() + "] thread " );
	}
}

public class Driver {
	public static void main(String[] args) {
		System.out.println(" START MAIN() ");
		System.out.println("This code is executed by : [" + Thread.currentThread().getName()+ "] thread " );
		System.out.println("END MAIN()");

		
		MyTHread t1 = new MyTHread();
		t1.setName("Waiter");
		t1.start();
		MyTHread t2 = new MyTHread();
		t2.setName("server");
		t2.start();
		MyTHread t3 = new MyTHread();
		t1.setName("cooking food");
		t3.start();
		MyTHread t4 = new MyTHread();
		t1.setName("server started the serving the food");
		t4.start();
		MyTHread t5 = new MyTHread();
		t1.setName("Waiter will take the order");
		t5.start();

		
	}

}
