package oops6practice;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Delivery D7 = new OnedayDelivery();
		D7.doSomething("suman", 10);
		D7 = new Expressdelivery();
		D7.doSomething("ram", 110);
		// in run_time Polymorphism  Object is called at methodriding during run time 
		D7 = new Delivery();
		D7.doSomething(null, 0);
		
		
		

	}

}
