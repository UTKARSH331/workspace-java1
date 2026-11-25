package com.builder.design.pattern;

import java.util.List;

class BurgerMeal{
	 // Required componenets
	 private final String bunType;
	 private final String patty;
	 // optional components
	 
	 private final boolean hasCheese;
	 private final List<String> toppings;
	 private final String side;
	 private final String drink;
	 public BurgerMeal( BurgerBuilder builder) {
		super();
		this.bunType = builder.bunType;
		this.patty = builder.patty;
		this.hasCheese = builder.hasCheese;
		this.toppings = builder.toppings;
		this.side = builder.side;
		this.drink = builder.drink;
	 }
	 
	public static class BurgerBuilder{
		
		 // Required componenets
		 private final String bunType;
		 private final String patty;
		 // optional components	 
		 private  boolean hasCheese;
		 private  List<String> toppings;
		 private  String side;
		 private String drink;
		 public BurgerBuilder(String bunType, String patty) {
			super();
			this.bunType = bunType;
			this.patty = patty;
		 }
		 
		 public BurgerBuilder withCheese(boolean hasCheese) {
			 this.hasCheese = hasCheese;
			 return this;
		 }
		 public BurgerBuilder withSide(String side) {
			 this.side = side;
			 return this;
		 }
		 public BurgerBuilder withDrink(String drink) {
			 this.drink = drink;
			 return this;
		 }
		 public BurgerBuilder withToppings(List<String> toppings) {
			 this.toppings = toppings;
			 return this;
		 }
		public BurgerMeal build() {
			return new BurgerMeal(this);
		}
	}
	
}


public class Driver {
	public static void main(String[] args) {
		BurgerMeal burgerwithCheese = new BurgerMeal.BurgerBuilder("Wheat", "veg").withCheese(true).build();
		System.out.println(burgerwithCheese);
		
				
	}

}
