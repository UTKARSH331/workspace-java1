package oops4;

public class Car {
	private String CarOwner;
	private int SerialNo;
	public void doDisplay() {
		System.out.println("All car accesories are available ");
		return;
	}

}
class BMW extends Car{
	private String CarFeatures;
	private int CarId;
	public void doDisplay() {
		System.out.println("All BMW features are available ");
		return;
	}
}

 class Driver{
	public static void main(String args[]) {
		BMW M5= new BMW();
		M5.doDisplay();
	}
}
