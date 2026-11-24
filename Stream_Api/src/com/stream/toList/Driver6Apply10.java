package com.stream.toList;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Products1{
	String name;
	Double price;
	public Products1(String name, Double price) {
		this.name = name;
		this.price = price;
	}
	public String toString() {
		return name + " " + price;
	}
}

public class Driver6Apply10 {
	public static void main(String[] args) {
		List<Products1> p1Input = Arrays.asList(
				new Products1("Laptop ", 10000.0),
				new Products1("Mouse ", 10100.01),
				new Products1("printer", 5000.0),
				new Products1("Keyword ", 450.0)		
				);
		List<Products1> l1name = p1Input.stream().filter(w -> w.price>1000).map(e -> {e.price = e.price* 0.90; return e;}).collect(Collectors.toList());
		System.out.println("l1name : " + l1name);
	}

}
