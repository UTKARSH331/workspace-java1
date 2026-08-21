package oops5;

public class Delivery {
	public Post doDelivery() 
	{
		System.out.println("all  delivery are done ");
		return new Post();
	}
	public Post doDeliveryFast() {
		System.out.println( "doDeliveryFast() return new Post ");
		return new Post();
	}
	public Employee doWork() {
		System.out.println("doWork on time with Employee ");
		return new Employee();
	}

}
