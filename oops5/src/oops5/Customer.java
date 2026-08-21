package oops5;

public class Customer extends Object{
	String name = "Customer";
	int price = 121;
	int ItemNo = 123;
	
	public void allDetails(String Name, int price) {
		System.out.println("All details are passed via Customer");
	}
	private void allCalculate(String Name, int price, int ItemNo) {
		System.out.println("All details are passed via Customer");
	}
	void givenTo(String name ) {
		allCalculate(name, price, ItemNo);
		System.out.println("all items are given to customer");
	}
	
	

}
