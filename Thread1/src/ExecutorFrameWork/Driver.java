package ExecutorFrameWork;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Driver {
	
	public static void main(String[] args) {
		ExecutorService executors = Executors.newFixedThreadPool(2);
		
		for (int i =0; i<=5; i++) {
			int taskId = i;
			
			executors.execute(() -> {
				System.out.println("Task " + taskId + "is performed BY : " + Thread.currentThread().getName() );
			});
		}
		executors.shutdown();
	
	}

}
