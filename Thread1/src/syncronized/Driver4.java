package syncronized;

public class Driver4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Thread t1 = new Thread( () -> Count21.increment() );
		
		Thread t2 = new Thread( () -> Count21.increment());
		
		t1.start();
		t2.start();

	}

}

class Count21{
	
	static int count =0;
	static void increment() {
		synchronized(Count21.class) {
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
