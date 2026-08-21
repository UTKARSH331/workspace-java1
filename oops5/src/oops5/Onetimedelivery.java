package oops5;

public class Onetimedelivery extends Delivery {
	public SpeedPost doDelivery() {
		System.out.println(" do one time delivery ");
		return new SpeedPost();
	}
	public SpeedPost doDeliveryFast() {
		System.out.println("doDeliveryFast() return new Speed Post  ");
		return new SpeedPost();
	}
	public Manager doWork() {
		System.out.println("doWork on time with Manager ");
		return new Manager();
	}
	

}
