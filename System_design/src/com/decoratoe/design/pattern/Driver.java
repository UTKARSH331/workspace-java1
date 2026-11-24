package com.decoratoe.design.pattern;

interface Character{
	String getAbilities();
}
 class Mario implements Character{

	@Override
	public String getAbilities() {
		// TODO Auto-generated method stub
		return "Mario";
	}
 }
 abstract class CharacterDecorator implements Character{
	 protected Character character;
	 public CharacterDecorator (Character character) {
		 this.character = character;
	 }
 }
  class CharacterHeightUP extends CharacterDecorator{

	public CharacterHeightUP(Character character) {
		super(character);
		// TODO Auto-generated constructor stub
	}
	public String getAbilities() {
		return character.getAbilities() + " with height_UPs";
	}
  }
  class GunPowder extends CharacterDecorator{

	public GunPowder(Character character) {
		super(character);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String getAbilities() {
		// TODO Auto-generated method stub
		return character.getAbilities() + "gun_Powder";
	}
  }
  class StarPower extends CharacterDecorator {

	public StarPower(Character character) {
		super(character);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String getAbilities() {
		// TODO Auto-generated method stub
		return character.getAbilities() + "with star power";
	} 
  }
  public class Driver{
	  public static void main(String args[]) {
		  Character m1 = new Mario();
		  System.out.println("Basic characters :" + m1.getAbilities());
		  m1 = new CharacterHeightUP(m1);
		  System.out.println();
		  m1 = new GunPowder(m1);
		  System.out.println("After gun powder :" + m1.getAbilities());
		  m1 = new StarPower(m1);
		  System.out.println("Start power : " + m1.getAbilities());
		  
	  }
  }