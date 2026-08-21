package oops2;

public class Practicevehicles extends practiceflipkart {
	String vehiclesName1 = "toyato";
	String vehiclesNmaeSportsCar = "ferrari";
	String bonousCar = "BMW";
	public void doParcel() {
		System.out.println("cars are delivered ");
	}
}
class HomeStationary  extends practiceflipkart {
	
	String foodUtensils = "juicer";
	String foodUtensils1 = "Spoon";
	public void allReadyhomestationary() {
		System.out.println("all things are ready ");
	}
	public static void main (String args[]) {
		HomeStationary homestationary = new HomeStationary();
		System.out.println( "homestationary " + homestationary.foodUtensils);
		System.out.println( "homestationary " + homestationary.foodUtensils1);
		homestationary.allReadyhomestationary();
	}
	
}
