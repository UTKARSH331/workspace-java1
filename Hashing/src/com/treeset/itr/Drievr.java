package com.treeset.itr;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

class Product implements Comparable<Product>{
	String Product_Id;
	String Name;
	String Price;
	String Status;
	public Product(String Product_Id, String Name, String Price, String Status){
		super();
		this.Product_Id = Product_Id;
		this.Name = Name;
		this.Price = Price;
		this.Status = Status;	
	}
	@Override
	public int compareTo(Product o) {
		// TODO Auto-generated method stub
		int result = this.Product_Id.compareTo(o.Product_Id);
		System.out.println(this.Product_Id + "," +this.Product_Id + "," + result );
		return result;
	}
	
}

public class Drievr {
	public static void main(String args[]) {
		Set<Product> productset = new TreeSet<Product>();
		Product p1 = new Product("545", "samsung", "12677", "success");
		Product p2 = new Product("54523", "micromax", "127877", "success");
		Product p3 = new Product("545", "orange", "128677", "unsuccess");
		Product p4 = new Product("545", "gauava", "126727", "success");
		productset.add(p1);
		productset.add(p2);
		productset.add(p3);
		productset.add(p4);
		Iterator<Product > itr =  productset.iterator();
		while(itr.hasNext()) {
			Product pro = itr.next();
			System.out.println(pro.Product_Id);
		}
		
	}
}
