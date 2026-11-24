package syncronized;

public class Driver01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Count1 c1 = new Count1();
		
		Thread t1 = new Thread( () -> c1.show() );
		
		Thread t2 = new Thread( () -> c1.show() );
		
		t1.start();
		t2.start();

	}

}

class Count1{
	
	synchronized void show() {
		System.out.println("it is enetered in count state : " + Thread.currentThread().getName());
		
		try {
			Thread.sleep(1000);
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		System.out.println("it is exicted from count state : " + Thread.currentThread().getName());
	}
	
}
