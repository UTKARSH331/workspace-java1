package oops4;

public  class E_commerce_product {
	String productNane = "Car ";
	int productId = 123;
	int price = 51000;
}

class Electronics extends E_commerce_product{
	String brand = "Samsung ";
	int warrantyYears = 3 ;
	int price = 55000; 
	int Discount = 10;
	public void doDiscount() {
		if (price > 50000) {
			 System.out.println("Electronics Discount " + price + price*Discount/100);
		}
	}
	public void acceptDetails() {
		System.out.println("All details are verified for Electronics  ");
	}
	public void displayDetails() {
		System.out.println("all Display_on_your_Screen for Electronics " );
	}
}
class Clothing extends E_commerce_product{
	String color = "red";
	String size = "34";
	int Discount = 20;
	int price = 65000;
	public void doDiscount() {
		if(price > 2000) {
			System.out.println("Clothing_discount " + price + price*Discount/100);
		}
	}
	public void acceptDetails() {
		System.out.println("All details are  verified for Cloths ");
	}
	public void displayDetails() {
		System.out.println("all Display_on_your_Screen for Cloths" );
	}
	
}
class Book extends E_commerce_product{
	String Author = "Ramayan ";
	int genration = 2;
	int Discount = 10;
	int price = 90000;
	public void doDiscount() {
		System.out.println("Discount_onBook " + price + price * Discount/100);
	}
	public void acceptDetails() {
		System.out.println("All details are verified ");
	}
	public void displayDetails() {
		System.out.println("all Display_on_your_Screen " );
	}
}

 class driver{
	public static void main(String args[]) {
		
		//String name = args[0];
	//	Book B1 = new Book();
		Clothing  C1 = new Clothing();
		Electronics E1 = new Electronics();
		C1.acceptDetails();
		E1.acceptDetails();
		C1.doDiscount();
		
		
	}
}
