package com.factory.design.pattern.factory.method;

interface Burger{
	void prepare();
}

class BasicBurger implements Burger{

	@Override
	public void prepare() {
		System.out.println("it is a basic burgerv type");
	}
}
class StandardBurger implements Burger{

	@Override
	public void prepare() {
		System.out.println("it is a standard burgerv type");
	}
}
class PremiumBurger implements Burger{

	@Override
	public void prepare() {
		System.out.println("it is a premium burgerv type");
	}
}
class WheatBasicBurger implements Burger{

	@Override
	public void prepare() {
		System.out.println("it is a WheatBasicBurger burgerv type");
	}
}
class WheatStandardBurger implements Burger{
	@Override
	public void prepare() {
		System.out.println("it is a WheatStandardBurger burgerv type");
	}
}
class  WheatPremiumBurger implements Burger{
    @Override
	public void prepare() {
		System.out.println("it is a WheatPremiumBurger burgerv type");
	}
}
interface BurgerFactory{
	Burger createBurger(String type);
}
class SinghBurger implements BurgerFactory{

	@Override
	public Burger createBurger(String type) {
		// TODO Auto-generated method stub
		if(type.equalsIgnoreCase("Basic")) {
			return new BasicBurger();
		} else if(type.equalsIgnoreCase("Standard")) {
			return new StandardBurger();
		} else if(type.equalsIgnoreCase("Premium")) {
			return new PremiumBurger();
		} else {
			System.out.println("invalid burger type!");
			return null;
		}	
	}
}
class KingBurger implements BurgerFactory{

	@Override
	public Burger createBurger(String type) {
		if(type.equalsIgnoreCase("Basic")) {
			return new WheatBasicBurger();
		} else if(type.equalsIgnoreCase("Standard")) {
			return new WheatStandardBurger();
		} else if(type.equalsIgnoreCase("Premium")) {
			return new WheatPremiumBurger();
		} else {
			System.out.println("inavlid in kingburger type");
			return null;
		}
		
	}
	
}
public class Driver {
	public static void main(String args[]) {
		String type = "Basic";
		BurgerFactory b1 = new SinghBurger();
		Burger b2 = b1.createBurger(type);
		if(b2 != null) {
			b2.prepare();
		}
	}

}
