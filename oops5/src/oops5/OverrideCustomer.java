package oops5;

public class OverrideCustomer {
	private void showDetails() {
		System.out.println("all details are passed ");
	}
	public void showDetails1() {
		System.out.println("all details are passed ");
	}
	 public final void OverAllCOst() {
		System.out.println("all details are passed OverAllCost ");
	}
	public void calculatePrice () {
		System.out.println("All price are clearly checked ");
	}

}
class GoldCustomer extends OverrideCustomer{
	public void calculatePrice () {
		System.out.println("all price for gold is verified ");
	}
	public void showDetails1() {
		System.out.println("all details of gold are passed are passed  ");
	}
	/*public  void OverAllCOst() {
		System.out.println("all details are passed OverAllCost in Gold  "); due to final 
	}*/
} 

