package oops8Abstract_abd_interface;

abstract class VehiclesCanAbstractHaveAStaticMethods {
	void company() {
		System.out.println("yes CanAbstractHaveAStaticMethods");
	}
	static void company(String model) {
		System.out.println("yes CanAbstractHaveAStaticMethods and it has a 1 parameters ");
	}
	abstract void start();
}
class Car1 extends VehiclesCanAbstractHaveAStaticMethods{
	@Override
	void start() {
		// TODO Auto-generated method stub
		System.out.println("it is in car");
	}
	static void company(String model) {
		System.out.println("yes CanAbstractHaveAStaticMethods and it has a 1 parameters and it is in car");
	}
	void company() {
		System.out.println("yes CanAbstractHaveAStaticMethods and it is in car");
	} 
}
