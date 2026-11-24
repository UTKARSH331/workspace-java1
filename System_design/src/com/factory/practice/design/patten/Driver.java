package com.factory.practice.design.patten;
// simple factory
interface Burger{
	void prepare();
}

class BasicSBurger implements Burger{

	@Override
	public void prepare() {
		System.out.println("it is a basic burger");
	}
	
}
class StandardBurger implements Burger{
	@Override
	public void prepare() {
		System.out.println("it is a Standard burger");
	}	
}
class PremiumBurger implements Burger{
	@Override
	public void prepare() {
		System.out.println("it is a premium burger");
	}	
}

class BurgerFactory {
	public Burger createBurgerFactory(String dataType) {
		if(dataType.equalsIgnoreCase("Basic")) {
			return new BasicSBurger();
		} else if (dataType.equalsIgnoreCase("Standard")) {
			return new StandardBurger();
		} else if(dataType.equalsIgnoreCase("Premium")) {
			return new PremiumBurger();
		} else {
			System.out.println("invalid burger");
			return null;
		}
	}
}

public class Driver {
	public static void main(String[] args) {
		String datatype = "basic" ;
		BurgerFactory B1 = new BurgerFactory();
		Burger burger = B1.createBurgerFactory(datatype);
		//System.out.println("burger came out " + burger);
		if (burger != null) {
			burger.prepare();
		}
	}

}
