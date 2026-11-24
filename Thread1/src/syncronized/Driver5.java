package syncronized;

public class Driver5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Thread t1 = new Thread( () -> Thest.increment() );
		
		Thest t22 = new Thest();
		
		Thread t2 =  new Thread( () -> t22.m2()  );
		
		Thread t3 =  new Thread( () -> t22.m2()  );
		
		t1.start();
		t2.start();
		t3.start();

	}

}

class Thest{
	
	static int count = 0;
	
	static void increment() {
		synchronized (Thest.class) {
			try {
				Thread.sleep(2000);
			} catch (Exception e) {
				// TODO: handle exception
			}
			
			count++;
			System.out.println(count);
			
		}
	}
	
	void m2() {
		synchronized(this) {
			
			System.out.println("m2.enter");
			try {
				Thread.sleep(2000);
			} catch (Exception e) {
				// TODO: handle exception
			}
			
			System.out.println("m2.exist");
		}
	}
	
	
}
