package ExecutorFrameWork;

import java.util.concurrent.CompletableFuture;

public class Driver5 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CompletableFuture< Void> f1 = CompletableFuture.supplyAsync(() -> 10)
				.thenAccept(r -> System.out.println(r));
			
		

	}

}
