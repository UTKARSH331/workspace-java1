package ITC;
// it donot give the output bcz it is for the understanding purpose of thread
public class Driver2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Box2 b2 = new Box2();
		
		Thread t1 = new Thread( () -> {
			for(int i =0; i<=20; i++) {
				try {
					Thread.sleep(100);
				} catch (Exception e) {
					// TODO: handle exception
				}
				
				b2.producer(i);
				
				System.out.println("items is here : " + i);
			}
		});
		
		Thread t2 = new Thread( () -> {
			for(int i =0; i<=20; i++) {
				try {
					Thread.sleep(70);
				} catch (Exception e) {
					// TODO: handle exception
				}
				
				b2.consumer();
				
				System.out.println("items is here : " + i);
			}
		});
		t1.start();
		t2.start();

	}

}

class Box2{
	
	volatile Integer item;
	volatile Boolean flag  = false;
	
	synchronized void producer(int value) {
		while(flag == true) {
			// do nothing
		}
		System.out.println("items in producer side : " + item);
		item = value;
		flag = true;;
	}
	

	synchronized void consumer() {
		while(flag == false) {
			// do nothing
		}
		System.out.println("items passed through consumer side : " + item);
		item = null;
		flag = false;
	}
	
	
	
	
}
