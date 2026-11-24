package ExecutorFrameWork;

import java.util.concurrent.CompletableFuture;

public class Driver7 {
	
	public static void main(String[] args) {
		CompletableFuture< Integer> f1 = CompletableFuture.supplyAsync(() -> 10);
		
		CompletableFuture< Integer> f2 = CompletableFuture.supplyAsync(() -> 20);
		
		CompletableFuture< Void> f3result = f1.thenCombine(f2, (a, b) -> a+b)
				.thenAccept(result -> System.out.println(result));
	}

}
