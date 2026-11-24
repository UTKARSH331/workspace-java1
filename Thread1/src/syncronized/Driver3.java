package syncronized;

public class Driver3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Bank b1 = new Bank();
		
		Thread t1 = new Thread( () -> b1.deposit() );
		
		Thread t2 = new Thread( () -> b1.withdraw() );
		
		System.out.println("t1 started");
		t1.start();
		
		System.out.println("t2 started");
		t2.start();
		
		Thread t3 = new Thread( () -> b1.show() );
		

		Thread t4 = new Thread( () -> b1.show() );
		
		System.out.println("t3 started");
		
		t3.start();
		
		
		System.out.println("t4 started");
		t4.start();

	}

}
class Bank{
	Object o1 = new Object();
	Object o2 = new Object();
	
	
	void show() {
		synchronized(new Object()) {
			System.out.println("thread mwthyod show is activated :" + Thread.currentThread().getName());
			
			try {
				Thread.sleep(2000);
			} catch (Exception e) {
				// TODO: handle exception
			}
			
			System.out.println("thread mwthyod show is executed  : "  + Thread.currentThread().getName());
		}
	}
	
	void withdraw() {
		synchronized(o1) {
			
System.out.println("thread mwthyod withdraw is activated :" + Thread.currentThread().getName());
			
			try {
				Thread.sleep(2000);
			} catch (Exception e) {
				// TODO: handle exception
			}
			
			System.out.println("thread mwthyod withdraw is executed  : "  + Thread.currentThread().getName());
			
		}
	}
	
	void deposit() {
		synchronized(o2) {
			
System.out.println("thread mwthyod deposit is activated :" + Thread.currentThread().getName());
			
			try {
				Thread.sleep(2000);
			} catch (Exception e) {
				// TODO: handle exception
			}
			
			System.out.println("thread mwthyod deposit is executed  : "  + Thread.currentThread().getName());
			
		}
	}
	
	
}