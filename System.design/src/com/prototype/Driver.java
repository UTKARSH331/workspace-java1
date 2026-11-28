package com.prototype;

import com.builder.design.pattern.p3.main;

interface Cloneable{
	Cloneable clone();
}

class NPC implements Cloneable{
	public String name;
	public String health;
	public String attack;
	public String defense;
	public NPC(String name, String health, String attack, String defense) {
		super();
		this.name = name;
		this.health = health;
		this.attack = attack;
		this.defense = defense;
		System.out.println("it is in constructor of NPC");
	}
	public NPC (NPC other) {
		name = other.name;
		health = other.health;
		attack = other.attack;
		defense = other.defense;
		
		System.out.println("it is in copy constructor");
	}
	 // the clone method required by Prototype
	public Cloneable clone() {
		return new NPC(this);
	}
	  public void describe() {
	       System.out.println("NPC " + name + " [HP=" + health + " ATK=" + attack 
	            + " DEF=" + defense + "]");
	   }
	  public void setName(String n) {
		  this.name = n;
	  }
	  public void setHealth(String h) {
		  this.health = h;
	  }
	  public void setAttack(String a) {
		  this.attack = a;
	  }
	  public void setDefense(String d) {
		  this.defense = d;
	  }
	
}

public class Driver {
	
	public static void main(String[] args) {
		NPC alien1 = new NPC("Allien", "50","3", "0" );
		
		alien1.describe();
		
		NPC coppiedAllien1 = (NPC)alien1.clone();
		
		coppiedAllien1.describe();
		
		NPC coppiedAllien2 = (NPC)alien1.clone();
		coppiedAllien2.setAttack("12");
		coppiedAllien2.setDefense("10");
		coppiedAllien2.setHealth("50");
		
		coppiedAllien2.describe();
	}

}
