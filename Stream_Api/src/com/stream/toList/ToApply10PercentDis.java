package com.stream.toList;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Products{
	String name;
	Double price;
	public Products(String name, Double price) {
		super();
		this.name = name;
		this.price = price;
	}
	@Override
	public String toString() {
		return name + " " + price;
	}
	
}
public class ToApply10PercentDis {
	public static void main(String[] args) {
		List<Products> p1Input = Arrays.asList(
				new Products("Laptop ", 10000.0),
				new Products("Mouse ", 10100.01),
				new Products("printer", 5000.0),
				new Products("Keyword ", 450.0)		
				);
		List<Products> InputProduct = p1Input.stream().filter(w -> w.price > 1000).map(e -> {e.price = e.price*0.90; return e;}).collect(Collectors.toList());
		System.out.println("InputProduct : " + InputProduct );		
	}
}
