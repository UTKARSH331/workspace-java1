package threadsmethods;

public class Driver {
	
	
	public static void main(String args[]) {
		System.out.println("thraed main starts");
		
		  
		Thread t1 = new Thread(() -> {System.out.println("it is in thread t1");
		});
		t1.start();
		
		System.out.println("threads end here");
		//System.out.println();
	}
	

}
