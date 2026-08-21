package oops6practice;

public class Delivery {
	public void doSomething(String name, int roll) {
		System.out.println("Delivery7 ");
	}

}
class Expressdelivery extends Delivery{
	
	public void doSomething(String name, int roll) {
		System.out.println("xpressDelivery Delivery7 ");
	}
}
class OnedayDelivery extends Expressdelivery{
	public void doSomething(String name, int roll) {
		System.out.println("OnedayDelivery Delivery7 ");
	}

}
