package oops5;

public class Goldcustomer extends Customer {
	String name = "Goldcustomer";
	int price = 221;
	int ItemNo = 223;
	public void allDetails(String Name, int price) {
		System.out.println("All Gold details are passed via Customer");
	}
	protected void allCalculate(String Name, int price, int ItemNo) {
		System.out.println("All Gold details are calculated to  Customer");
	}
	public void givenTo(String name ) {
		System.out.println("all gold items are given to customer");
	}
}
