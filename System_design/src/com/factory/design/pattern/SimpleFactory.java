package com.factory.design.pattern;

interface Burger {
	void prepare();
}

class BasicBurger implements Burger{

	@Override
	public void prepare() {
		System.out.println("this is basic burger type");
		
	}
}
class StandardBurger implements Burger{

	@Override
	public void prepare() {
		System.out.println("Standard burger type");	
	}
}
class PremiumBurger implements Burger{

	@Override
	public void prepare() {
		System.out.println("premiumBurger");
	}
}
class BurgerFactory{
	public Burger createBurger(String type) {
		if(type.equalsIgnoreCase("basic")) {
			return new BasicBurger();
		} else if(type.equalsIgnoreCase("standard")) {
			return new StandardBurger();
		} else if(type.equalsIgnoreCase("premium")) {
			return new PremiumBurger();
		} else {
			System.out.println("invalid burger type");
			return null;
		}
	}
}
public class SimpleFactory {
	public static void main(String args[]) {
		String type = "basic";
		BurgerFactory b1 = new BurgerFactory();
		Burger burger = b1.createBurger(type);
		if(burger != null) {
			burger.prepare();
		}
	}

}
