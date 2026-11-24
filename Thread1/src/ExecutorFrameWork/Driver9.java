
package ExecutorFrameWork;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Driver9 {

    public static void main(String[] args) {

        ExecutorService executor =
                Executors.newVirtualThreadPerTaskExecutor();

        for (int i = 1; i <= 5; i++) {
            executor.submit(() -> {
                System.out.println(
                    "Task executed by " + Thread.currentThread()
                );
            });
        }

        executor.shutdown();
    }
}
