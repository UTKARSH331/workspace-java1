package oops8Abstract_abd_interface;

abstract class VehicleAbstractClassCanBeAFinal extends Object {
	final void company() {
		System.out.println("it is in the VehicleAbstractClassCanBeAFinal");
	}
	abstract void start();
	abstract int gears(String gear1, String G2);
}
class Bike1 extends VehicleAbstractClassCanBeAFinal{

	@Override
	void start() {
		// TODO Auto-generated method stub
		System.out.println("");
		
	}

	@Override
	int gears(String gear1, String G2) {
		// TODO Auto-generated method stub
		System.out.println("it is written in the Bike1 gear types ");
		return 0;
	}
	
}
