package com.comparable.product.multiple.field;

import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

class Payment1 implements Comparable<Payment1>{
	String refId;
	String name;
	String address;
	int Id;
	
	public Payment1 (String refId, String name, String address, int Id){
		super();
		this.refId = refId;
		this.name = name;
		this.address = address;
		this.Id = Id;
	}
	@Override
	public int compareTo(Payment1 o) {
		// TODO Auto-generated method stub
		int result = this.refId.compareTo(o.refId);
		if(result == 0) {
			result = this.name.compareTo(o.name);
		}
		if(result == 0) {
			result = this.address.compareTo(o.address);
		}
		if(result == 0) {
			result = Integer.compare(this.Id, o.Id);
		}
		return result;
	}
	public String toString (){
		return "Payment {" +
	            "id =" + Id  + 
	            "name = " + name +
	            "refId = " + refId +
	            "address = " + address +
	            '}';
	}
	
}
public class Driver5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<Payment1 > payset = new TreeSet<Payment1>();
		payset.add(new Payment1("upi", "UTK" , "BHR", 121));
		payset.add(new Payment1("upi", "UTK" , "BHR", 1212));
		payset.add(new Payment1("upi", "UTK" , "BHR", 1221));
		payset.add(new Payment1("upi", "UTK1" , "BHR", 121));
		payset.add(new Payment1("upi", "UTKR" , "BHR", 121));
		payset.add(new Payment1("upi", "UTK" , "BHR1", 121));
		payset.add(new Payment1("upi", "UTK" , "BHR2", 121));
		payset.add(new Payment1("Gpay", "RTK", "CHE", 323));
		payset.add(new Payment1("phpe", "SHM", "HYD", 434));
		
		// Collections.sort(payset); for this we had to do array to list in this . 
		
		Iterator<Payment1> p1 = payset.iterator();
		while(p1.hasNext()) {
			Payment1 p22 = p1.next();
			System.out.println("p22.refId : " + p22.refId + " p22.name : " + p22.name + "p22.address : " + p22.address + "p22.Id : " + p22.Id);
	}

}

}
