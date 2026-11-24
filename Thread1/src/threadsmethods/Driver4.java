package threadsmethods;

//daemon 

public class Driver4 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		Thread t2 = new Thread( () -> {
			while(true) {
				System.out.println("Running");
		}
		});
		
		//daemon thread by deafult it is false
		
		t2.setDaemon(true);
		
		t2.start();

		
		// garbage collection is a daemon thread
		
	}

}
