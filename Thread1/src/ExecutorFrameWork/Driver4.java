package ExecutorFrameWork;

import java.util.concurrent.CompletableFuture;

public class Driver4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CompletableFuture< Integer> f1 = CompletableFuture.supplyAsync(() -> 10)
				.thenApply(r -> r*2)
				.thenApply(r -> r*3);
		
		try {
			System.out.println(f1.get());
			
		} catch (Exception e) {
			// TODO: handle exception
		}

	}

}
