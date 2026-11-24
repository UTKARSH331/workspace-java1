package com.comparable.product.multiple.field;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

class Payment implements Comparable<Payment>{
	String refId;
	String name;
	int Id;
	String address;
	public Payment (String refId, String name, int Id, String address){
		super();
		this.refId = refId;
		this.name = name;
		this.Id = Id;
		this.address = address;
	}
	@Override
	public int compareTo(Payment o) {
		// TODO Auto-generated method stub
		int result = this.refId.compareTo(o.refId);
		if(result == 0) {
			result = this.name.compareTo(o.name);
		}
		if(result == 0) {
			result = Integer.compare(this.Id, o.Id);
		}
		if(result == 0) {
			result = this.address.compareTo(o.address);
		}
		return result;
	}
	public String toString(){
		return "Payment {" +
	            "id =" + Id  + 
	            "name = " + name +
	            "refId = " + refId +
	            "address = " + address +
	            '}';
	}
}
public class Driver4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<Payment > payset = new TreeSet<Payment>();
		payset.add(new Payment("upi", "Utk" , 121, "BHR" ));
		payset.add(new Payment("Gpay", "SHUMBHAM ", 232, "CHE"));
		payset.add(new Payment("phpe" , "RTK", 343, "PNBE"));
		payset.add(new Payment("PAYTM","HERO", 0121, "DLH"));
		payset.add(new Payment("PAYTM","HERO", 0123, "DLH"));
		
		Iterator<Payment> p1 = payset.iterator();
		while(p1.hasNext()) {
			Payment p22 = p1.next();
			System.out.println("p22.refId : " + p22.refId +  "  p22.name : " + p22.name + " p22.Id : " +  p22.Id + "p22.address : "  + p22.address);
	}

}

	
	
}
