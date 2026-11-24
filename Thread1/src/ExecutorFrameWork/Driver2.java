package ExecutorFrameWork;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
// callable ExecutorService executors = Executors.newFixedThreadPool(2); and ashyncronous  and Future<Integer> f1 = this is used for the future
public class Driver2 {
	public static void main(String[] args) {
		ExecutorService executors = Executors.newFixedThreadPool(2);
		
		Future<Integer> f1 = executors.submit(() -> {
			try {
				Thread.sleep(3000);
			} catch(Exception e) {}
			return 10;
		});
		
		try {
			System.out.println(f1.get());
		} catch(Exception e) {}
		executors.shutdown();
	}

}
