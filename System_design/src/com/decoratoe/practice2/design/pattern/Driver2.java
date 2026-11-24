package com.decoratoe.practice2.design.pattern;

interface ICharacter{
	String getAbilities();
}

class Mario implements ICharacter{
	@Override
	public String getAbilities() {
		// TODO Auto-generated method stub
		return "Mario ability in base form";
	}	
}

abstract class DecoratorCharacter implements ICharacter{
	ICharacter c;

	public DecoratorCharacter(ICharacter c) {
		super();
		this.c = c;
	}
}

class StarPower extends DecoratorCharacter{

	public StarPower(ICharacter c) {
		super(c);
		// TODO Auto-generated constructor stub
	}
	@Override
	public String getAbilities() {
		// TODO Auto-generated method stub
		return c.getAbilities() + "it has also star power with limited access";
	}
}
class GunPower extends DecoratorCharacter{

	public GunPower(ICharacter c) {
		super(c);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String getAbilities() {
		// TODO Auto-generated method stub
		return c.getAbilities() + "with GunPOwer";
	}
}
class HeightUp extends DecoratorCharacter{

	public HeightUp(ICharacter c) {
		super(c);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String getAbilities() {
		// TODO Auto-generated method stub
		return c.getAbilities() + "with height_Up power";
	}
	
}

public class Driver2 {
	public static void main(String[] args) {
		ICharacter m1 = new HeightUp(new Mario());
		System.out.println("height up " + m1.getAbilities());
		
		ICharacter m2 = new StarPower(new Mario());
		System.out.println("height up " + m2.getAbilities());
		
		ICharacter m3 = new GunPower(new Mario());
		System.out.println("height up " + m3.getAbilities());
	}

}
