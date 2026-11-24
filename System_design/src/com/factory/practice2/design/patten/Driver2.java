package com.factory.practice2.design.patten;

interface Burger{
	void prepare();
}
class BasicBurger implements Burger{

	@Override
	public void prepare() {
		System.out.println("it is  a basic burger");		
	}	
}
class StandardBurger implements Burger{

	@Override
	public void prepare() {
		System.out.println("it is  a Standard burger");		
	}	
}
class premiumBurger implements Burger{

	@Override
	public void prepare() {
		System.out.println("it is  a premium burger");		
	}	
}

class BurgerFactory{
	public Burger createBurger(String datatype) {
		if(datatype.equalsIgnoreCase("Basic")) {
			return new BasicBurger();
		} else if (datatype.equalsIgnoreCase("Standard")) {
			return new StandardBurger();
		} else if (datatype.equalsIgnoreCase("Premium")) {
			return new premiumBurger();
	   } else {
		System.out.println( " invalid nput ");
		return  null;
	}
}
}
public class Driver2 {
	public static void main(String[] args) {
		String datatype = "standard";
		BurgerFactory b1 = new BurgerFactory();
		Burger burger = b1.createBurger(datatype);
		if(burger != null) {
			burger.prepare();
		}
				
	}

}
