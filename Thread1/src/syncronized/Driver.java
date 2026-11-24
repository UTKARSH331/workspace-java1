package syncronized;

public class Driver {
	
	public static void main(String[] args) {
		Count c1 = new Count();
		
		Thread t1 = new Thread( () -> c1.show() );
		
		Thread t2 = new Thread( () -> c1.show() );
		
		t1.start();
		
		t2.start();
		
		
	}

}

class Count{
	synchronized void show () {
		System.out.println("count started : " + Thread.currentThread().getName() );
		
		try {
			Thread.sleep(2000);
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		System.out.println("count endeed : " + Thread.currentThread().getName());
	}
}
