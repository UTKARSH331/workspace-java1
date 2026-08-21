package com.treeset.iterator;

import java.util.Comparator;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

class Payment implements Comparable<Payment>{
	String id;
	public Payment(String id) {
		this.id = id;
		// TODO Auto-generated constructor stub
	}
	

	@Override
	public int compareTo(Payment o1) {
		// TODO Auto-generated method stub
		int result = this.id.compareTo(o1.id);
		System.out.println(this.id + " " + this.id + " " + this.id + " " + result);
		//System.out.println(result);
		return result;
	}

	
}

public class Driver {
	public static void main(String args[]) {
		Set<Payment> paymentset = new TreeSet<Payment>();
		Payment p1 = new Payment("ABCDE");
		Payment p2 = new Payment("TGFTHG");
		Payment p3 = new Payment("HHFH");
		Payment p4 = new Payment("Bhvnhhv");
		paymentset.add(p1);
		paymentset.add(p2);
		paymentset.add(p3);
		paymentset.add(p4);
		Iterator<Payment> itr = paymentset.iterator();
		while(itr.hasNext()) {
			Payment payment = itr.next();
			System.out.println(payment.id);
		}
		
		
	}

}
