package com.factory.practice2.factory.design.patten;

interface Burger{
	void prepare();
}
class BaqsicBurger implements Burger{
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
		System.out.println("it is a preimium burger");
	}
	
}
class WheatPremiumBurger implements Burger{
	@Override
	public void prepare() {
		System.out.println("it is a preimium burger");
	}
	
}
class wheatStandardBurger implements Burger{
	@Override
	public void prepare() {
		System.out.println("it is a preimium burger");
	}
	
}
class wheatBasicBurger implements Burger{
	@Override
	public void prepare() {
		System.out.println("it is a preimium burger");
	}
	
}
interface BurgerFactory{
	Burger createFactory(String datatype);
}

class SinghBurger implements BurgerFactory{
	@Override
	public Burger createFactory(String datatype) {
		if(datatype.equalsIgnoreCase("Basic")){
			return new BaqsicBurger();
		} else if(datatype.equalsIgnoreCase("Standard")) {
			return new StandardBurger();
		} else if(datatype.equalsIgnoreCase("premium")) {
			return new PremiumBurger();
		} else {
			System.out.println("invalid enter");
			return null;
		}
	}
}
class KingBurger implements BurgerFactory{
	@Override
	public Burger createFactory(String datatype) {
		if(datatype.equalsIgnoreCase("Basic Wheat")){
			return new wheatBasicBurger();
		} else if(datatype.equalsIgnoreCase("Standard Wheat")) {
			return new wheatStandardBurger();
		} else if(datatype.equalsIgnoreCase("premium Wheat")) {
			return new WheatPremiumBurger();
		} else {
			System.out.println("invalid enter");
			return null;
		}
	}
}


public class Driver {
	public static void main(String[] args) {
		String datatype = "Basic";
		BurgerFactory b1 = new KingBurger();
		Burger burgerK = b1.createFactory(datatype);
		BurgerFactory b2 = new SinghBurger();
	Burger burgerS	= b2.createFactory(datatype);
		if(burgerK != null) {
			burgerK.prepare();
		}
		if(burgerS != null) {
			burgerS.prepare();
		}
		
		
	}
	

}
