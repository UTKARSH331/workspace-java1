package syncronized;

public class Driver1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Count3 c2 = new Count3();
		
		Count3 c3 = new Count3();
		
		Thread t1 = new Thread( () -> c2.Show() );
		
		Thread t2 = new Thread( () -> c3.Show2() );	
		
		t1.start();
		t2.start();

	}

}

class Count3 {
	
	synchronized void Show () {
		
		System.out.println("entered in show00 : " + Thread.currentThread().getName() );
		
		try {
			Thread.sleep(1000);
		} catch (Exception e) {
			// TODO: handle exception
		}
		 
		
		System.out.println("exicted from show00 : " + Thread.currentThread().getName());
		
	}
	
  synchronized void Show2 () {
		
		System.out.println("entered in show2.00 : " + Thread.currentThread().getName() );
		
		try {
			Thread.sleep(1000);
		} catch (Exception e) {
			// TODO: handle exception
		}
		 
		
		System.out.println("exicted from show2.00 : " + Thread.currentThread().getName());
		
	}
	
}
