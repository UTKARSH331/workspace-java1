package threadsmethods;


//package threadsmethods;

public class Driver1 {
	
	
	public static void main(String args[]) throws InterruptedException{
		System.out.println("thraed main starts");
		
		  
		Thread t1 = new Thread(() -> {

			try {
				Thread.sleep(2000);
			} catch (Exception e) {}
				System.out.println("it is catch block of t1");
			
			
		});
		t1.start();
		
		t1.join(3000);
		
		//t1.join();
		
		System.out.println("threads end here");
		//System.out.println();
	}
	

}
