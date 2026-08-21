package oops8Abstract_abd_interface;

public class Driver1VehiclesConstructor {
	public static void main(String args[]) {
		Car V1 = new Car();
		//String color = V1.color;
		V1.displayButton();
		VehiclesConstructor A1 = new Bike();
		A1.displayButton();
		Car S1 = new Car("S5", "Blue");
		S1.displayButton();
	}

}
