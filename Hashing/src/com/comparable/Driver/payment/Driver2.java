
package com.comparable.Driver.payment;

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
public class Driver2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<Payment > payset = new TreeSet<Payment>();
		payset.add(new Payment("upi"));
		payset.add(new Payment("Gpay"));
		payset.add(new Payment("phpe"));
		
		for (Payment p1 : payset) {
			System.out.println("p1.payset  like that com.comparable.Driver.payment.Payment@17a7cec2: " + p1);
			System.out.println(".........start......");
			System.out.println("p1.refId : " + p1.refId);
		}
	}

}
