package com.arraylist.implement.runnable;

class Task implements Runnable{
	public void run() {
          for (int i =0; i<10; i++) {
        	  if(i ==5) {
        		  try {
        			  System.out.println("sleeping");
					Thread.sleep(1000);
					System.out.println("sleeping over again start to do work");
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
        	  }
        	  System.out.println("printing " + i);
          }
	}
}
// runnable is better than thread bcz it extends also it supports like multiple inheritance 
public class Driver {
	public static void main(String[] args) {
		Task task = new Task();
		Thread t1 = new Thread(task);
		t1.start();
		System.out.println("Driver.main() End ");
	}

}
