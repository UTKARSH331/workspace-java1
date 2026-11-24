package syncronized;

public class Driver1_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Test test1 = new Test();
		
		Test test2 = new Test();
		
		Thread t1 = new Thread( () -> test1.Show() );
		
		Thread t2 = new Thread( () -> test2.Show2() );
		

		Thread t23 = new Thread( () -> test2.Show23() );
		
		t1.start();
		t2.start();
		t23.start();
		
	}

}

class Test{
	synchronized void Show () {
		System.out.println("it is show entring point results : " + Thread.currentThread().getName());
		
		try {
			Thread.sleep(1000);
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		System.out.println("it showed the results exicting point : " + Thread.currentThread().getName());
	}
	
	synchronized void Show2 () {
		System.out.println("it is show2 results entring point : " + Thread.currentThread().getName());
		
		try {
			Thread.sleep(1000);
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		System.out.println("it showed2 the results exicting point : " + Thread.currentThread().getName());
	}
	
	synchronized void Show23 () {
		System.out.println("it is show23 results entring point : " + Thread.currentThread().getName());
		
		try {
			Thread.sleep(1000);
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		System.out.println("it showed23 the results exicting point : " + Thread.currentThread().getName());
	}

	
}