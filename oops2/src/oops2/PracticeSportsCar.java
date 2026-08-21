package oops2;

public class PracticeSportsCar extends Practicevehicles {
	
        
	String maxSpeed = "500km/hr";
	String mileage  = "13km/hr";
	String fuelCapacity = "100ltr.";
	public void dodlievery() {
		System.out.println("cars are executed ");
	}
	public static void main(String args[]) {
		PracticeSportsCar sportCar = new PracticeSportsCar();
		System.out.println("sportCar " + sportCar.vehiclesNmaeSportsCar);
		System.out.println("sportCar_maxSpeed  " + sportCar.maxSpeed);
		System.out.println("sportCar_mileage  " + sportCar.mileage);
		sportCar.dodlievery();
	}
}

class CommercialCar extends Practicevehicles{
    
	String maxSpeed = "250km/hr";
	String mileage  = "40km/hr";
	String fuelCapacity = "150ltr.";
	public void parcelReady() {
		System.out.println("all done ready to go home ");
	}
	public static void main (String args[]) {
		CommercialCar commercialCar = new CommercialCar();
		System.out.println("commercialCar_vehicleName " + commercialCar.vehiclesName1);
		System.out.println("commercialCar_vehicleName " + commercialCar.mileage);
		System.out.println("commercialCar_maxSpeed  " + commercialCar.maxSpeed);
		commercialCar.parcelReady();
	}
}

