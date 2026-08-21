package oops8Abstract_abd_interface;

abstract class VehiclesConstructor {
	String engine;
	String color;
	String model;
	VehiclesConstructor (){
		this.engine = engine;
		this.color = color;
		this.model = model;
	}
	void displayButton() {
		System.out.println("displayButton() in vehiclesConstructor() ");
	}
	abstract void start();
}
 class Car extends VehiclesConstructor{
	
	Car(String model, String color){
		//super();
	}
	Car(){
		
	}
	
	void displayButton() {
		System.out.println("displayButton() in Car ");
	}

	@Override
	void start() {
		// TODO Auto-generated method stub
		
		
	}
}
class Bike extends VehiclesConstructor{
	Bike(){
		
	}
	void displayButton() {
		System.out.println("displayButton() in Bike() ");
	}

	@Override
	void start() {
		// TODO Auto-generated method stub
		
	}
	
}
