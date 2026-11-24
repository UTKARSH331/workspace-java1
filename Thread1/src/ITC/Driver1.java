package ITC;

public class Driver1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Box b1 = new Box();
		
		Thread t1 = new Thread( () -> {
			for (int i =0; i<= 20; i++) {
				try {
					Thread.sleep(1);
				} catch (Exception e) {
					// TODO: handle exception
				}
				b1.producer(i);
			}
		}) ;
		
		Thread t2 = new Thread(  () -> {
				for (int i =0; i<=20; i++) {
					try {
						Thread.sleep(2000);
					} catch (Exception e) {
						// TODO: handle exception
					}
					b1.consumer();
				}
		});
		
		t1.start();
		t2.start();

	}

}

class Box {
	Integer item;
	boolean flag = false;
	
	void producer(int value) {
		item = value;
		flag = true;
		
		System.out.println("items in producer : " + item);
	}
	
	void consumer() {
		
		//System.out.println("items deducted via consumer : " + item);
		item = null;
		flag = false;
		
		System.out.println("items deducted via consumer : " + item);
	}
}
