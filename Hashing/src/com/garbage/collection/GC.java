package com.garbage.collection;

import java.lang.ref.WeakReference;

class Phone1 {
	String brand;
	String model;
	public Phone1(String brand, String model) {
		super();
		this.brand = brand;
		this.model = model;
	}
	@Override
	public String toString() {
		return "Phone [brand=" + brand + ", model=" + model + "]";
	}
	

}
public class GC{
	public static void main(String[] args) {
		WeakReference<Phone1> phoneweakrefrences = new WeakReference<Phone1>(new Phone1("Apple", "16promax"));
		System.out.println(phoneweakrefrences.get());
		System.gc();
		try {
			Thread.sleep(1000);
		} catch(Exception ignoredException) {
			ignoredException.printStackTrace();
		}
		System.out.println(phoneweakrefrences.get());
	}
}

