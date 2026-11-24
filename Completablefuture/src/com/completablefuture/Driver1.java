package com.completablefuture;

import java.util.concurrent.CompletableFuture;
import java.util.function.Supplier;

public class Driver1 {
	public static void main(String[] args) {
		CompletableFuture<Integer> cf1 = CompletableFuture.supplyAsync(() -> {
			return 20;
		}).thenApplyAsync((n) -> 
		{
				System.out.println(Thread.currentThread().getName());
		return n*10;
		});
		// cf2
		CompletableFuture< Integer> cf2 =  CompletableFuture.supplyAsync( () -> 
		{
			System.out.println(Thread.currentThread().getName());
			return 30;
		}).thenApplyAsync((n) ->
		{
			System.out.println(Thread.currentThread().getName());
			return n* 10;
		});
		CompletableFuture<Integer> finalcf = cf2.thenCombineAsync( cf1, (a,b) -> a+b );
		System.out.println(finalcf.join());
	}

}

// supplier,
// consumer
// BiFunction
// what is the reason for completableFuture 

