package ITC;
public class Driver3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Box3 b2 = new Box3();
		
		Thread t1 = new Thread( () -> {
			for(int i =0; i<=20; i++) {
				try {
					b2.producer(i);
					Thread.sleep(100);
				} catch (Exception e) {
					// TODO: handle exception
				}
				
				
				
				System.out.println("items is here : " + i);
			}
		});
		
		Thread t2 = new Thread( () -> {
			for(int i =0; i<=20; i++) {
				try {
					b2.consumer();
					Thread.sleep(70);
				} catch (Exception e) {
					// TODO: handle exception
				}
				
			
				
				System.out.println("items is here : " + i);
			}
		});
		t1.start();
		t2.start();

	}

}

class Box3{
	
	volatile Integer item;
	volatile Boolean flag  = false;
	
	synchronized void producer(int value) throws InterruptedException  {
		while(flag == true) {
			// do nothing
			wait();
		}
		System.out.println("items in producer side : " + item);
		item = value;
		flag = true;;
		notify();
	}
	

	synchronized void consumer() throws InterruptedException {
		while(flag == false) {
			// do nothing
			wait();
		}
		System.out.println("items passed through consumer side : " + item);
		item = null;
		flag = false;
		notify();
	}
	
	
	
	
}
