package ExecutorFrameWork;

public class Driver8 {
	
	public static void main(String[] args) {
		Thread t1 =  Thread.startVirtualThread( () -> {
			System.out.println(Thread.currentThread() + "Says hello");
		});
		
		
		try {
			
			t1.join();
			
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

}
