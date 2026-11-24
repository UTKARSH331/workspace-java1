package threadsmethods;

public class Driver3 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		Thread t2 = new Thread( () -> {
			while(!Thread.currentThread().isInterrupted()) {
				System.out.println("Running");
		}
		});
		
		t2.start();
		Thread.sleep(1);
		t2.interrupt();
		
		t2.getPriority();

	}

}
