package threadsmethods;

public class Driver2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Thread t1 = new Thread( () -> {
			for(int i =0; i<=10; i++) {
				System.out.println("T1 : " + i);
				Thread.yield();
			}
		});
		
		Thread t2 = new Thread( () -> {
			for (int i =0; i<= 10; i++) {
				System.out.println("T2 : " + i);
			}
		});
		
		t1.start();
		t2.start();

	}

}
