package com.decorator.design.pattern.p2;

interface Character{
	String getAbilities();
}
class Mario implements Character{

	@Override
	public String getAbilities() {
		// TODO Auto-generated method stub
		return "mario";
	}
}
abstract class CharacterDecorator implements Character{
	protected Character character;
	public CharacterDecorator(Character character) {
		this.character = character;
	}	
}
class HeightUp extends CharacterDecorator{

	public HeightUp(Character character) {
		super(character);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String getAbilities() {
		// TODO Auto-generated method stub
		return "Max Heigh_Up" + character.getAbilities();
	}	
}
class GunPowder extends CharacterDecorator {

	public GunPowder(Character character) {
		super(character);
		// TODO Auto-generated constructor stub
	}
	public String getAbilities() {
		return "GunPoder " + character.getAbilities();
	}	
}
class Startpower extends CharacterDecorator{
	public Startpower(Character character) {
		super(character);
	} 
	public String getAbilities() {
		return "Starpower "+ character.getAbilities();
	}
}

public class Driver {
	public static void main(String args[]) {
		Character m1 = new Mario();
		System.out.println("m1.getAbilities " + m1.getAbilities());
		m1 = new HeightUp(m1);
		System.out.println("m1.getAbilities() " + m1.getAbilities());
		m1 = new GunPowder(m1);
		System.out.println(m1.getAbilities() + "in Gunpowder");
		m1 = new Startpower(m1);
		System.out.println(m1.getAbilities() + "Startpower");
	}

}
