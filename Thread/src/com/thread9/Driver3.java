package com.thread9;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

class MyThread2 implements Callable<Integer>{

	@Override
	public Integer call()  {
		// TODO Auto-generated method stub
		return 20;
	}
	
}
public class Driver3 {
	public static void main(String[] args) throws InterruptedException, ExecutionException {
		ExecutorService es = Executors.newFixedThreadPool(2);
		
		Future<Integer> future = es.submit(new MyThread2());
		System.out.println("result : " + future.get());
	}

}
