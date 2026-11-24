package com.comparable.product;


import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

class Payment implements Comparable<Payment>{
	String refId;
	public Payment (String refId){
		super();
		this.refId = refId;
	}
	@Override
	public int compareTo(Payment o) {
		// TODO Auto-generated method stub
		int result = this.refId.compareTo(o.refId);
		return result;
	}
}
public class Driver3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<Payment > payset = new TreeSet<Payment>();
		payset.add(new Payment("upi"));
		payset.add(new Payment("Gpay"));
		payset.add(new Payment("phpe"));
		
		Iterator<Payment> p1 = payset.iterator();
		while(p1.hasNext()) {
			Payment p22 = p1.next();
			System.out.println("p22.refId : " + p22.refId);
	}

}

	
	
}
