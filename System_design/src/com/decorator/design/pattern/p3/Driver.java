package com.decorator.design.pattern.p3;

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
	 public CharacterDecorator(Character charactor) {
		 this.character = charactor;
	 }
 }
 class HeightUp extends CharacterDecorator{

	public HeightUp(Character charactor) {
		super(charactor);
		// TODO Auto-generated constructor stub
	}
	public String getAbilities() {
		return "in height_Up" + character.getAbilities();
	}
 }
 class GunPowder extends CharacterDecorator{
	 public String getAbilities() {
		 return "in gun_powder " + character.getAbilities();
	 }
	 public GunPowder(Character character) {
		 super(character);
	 }
 }
 class StartPower extends CharacterDecorator{
	 public String getAbilities() {
		 return "Start_power " + character.getAbilities();
		 
	 }
	 public StartPower(Character character) {
		 super(character);
	 }
 }
public class Driver {
	public static void main(String args[]) {
		Character c1 = new Mario();
		System.out.println(c1.getAbilities() + " : mario " + HeightUp.class);
		 c1 = new HeightUp(c1);
		 System.out.println(c1.getAbilities() + "Height_ups"  + c1.hashCode());
		 c1 = new GunPowder(c1);
		 System.out.println(c1.getAbilities() + "GunPowder");
		 c1 = new StartPower(c1);
		 System.out.println(c1.getAbilities() + "star_power");
	}

}
