
 public class Delivery {

	static void doSomething(String name, int rollNo) {
		System.out.println("Delivery for a student ");
	}
}
class ExpressDelivery extends Delivery{
	static void doSomething(String name, int rollNo) {
		System.out.println("ExpressDelivery for a student ");
	}
}

 class Driver {
	public static void main(String args[] ){
		ExpressDelivery E1 = new ExpressDelivery();
		E1.doSomething("Suman", 10);
	}
}
