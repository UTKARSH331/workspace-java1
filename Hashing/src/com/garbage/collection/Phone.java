package com.garbage.collection;

public class Phone {
	String brand;
	String model;
	public Phone(String brand, String model) {
		super();
		this.brand = brand;
		this.model = model;
	}
	@Override
	public String toString() {
		return "Phone [brand=" + brand + ", model=" + model + "]";
	}
	

}
class Gc{
	public static void main(String[] args) {
		Phone phone = new Phone("Iphone", "16promax");
		System.out.println(phone + "phone");
		phone = null;
		System.gc();
		System.out.println("phone = null : " + phone );
	}
}
