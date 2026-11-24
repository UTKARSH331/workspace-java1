package syncronized;

public class Driver4_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Thread t1 = new Thread( () -> Count11.increment()  ); 
		t1.start();
		
		Thread t2 = new Thread( () -> Count11.increment()  ); 
		t2.start();

	}
}

class Count11{
	
	static int count = 0;
	
	static void increment() {
		synchronized (Count11.class) {
			
			try {
				Thread.sleep(2000);
			} catch (Exception e) {
				// TODO: handle exception
			}
			
			count++;
			System.out.println(count);
			
		}
	}
	
}
