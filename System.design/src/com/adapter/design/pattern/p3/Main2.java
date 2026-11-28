package com.adapter.design.pattern.p3;

import com.builder.design.pattern.p3.main;

interface PaymentGateway{
	void pay(String data);
}

class Razorpay{
	void paymentViaRazorpay(String data) {
		System.out.println("paymentViaRazorpay + " + data);
		//return "+ data + " + data;
	}
}
class PayU{
	
	void paymentViaPayU(String data) {
		System.out.println("paymentViaPayU + " + data);
		 
	}	
}
class Stripe{
	
	void paymentViaStripe(String data) {
		System.out.println("paymentViaStripe + " + data);
		//return "+ data + " + data;
	}	
}

class RazorpayAdapter implements PaymentGateway{
   private Razorpay rap;
   
	public RazorpayAdapter(Razorpay rap) {
	super();
	this.rap = rap;
}

	@Override
	public void pay(String data) {
		// TODO Auto-generated method stub
		System.out.println("razor pay payemt currently it is adapter");
		rap.paymentViaRazorpay(data);
	}
	
}

class StripeAdapter implements PaymentGateway{
	   private Stripe si;
	   
		public StripeAdapter(Stripe si) {
		super();
		this.si = si;
	}

		@Override
		public void pay(String data) {
			// TODO Auto-generated method stub
			System.out.println("Stripe pay payemt currently it is adapter");
			si.paymentViaStripe(data);
		}
		
	}
class PayUAdapter implements PaymentGateway{
	   private PayU pi;
	   
		public PayUAdapter(PayU pi) {
		super();
		this.pi = pi;
	}

		@Override
		public void pay(String data) {
			// TODO Auto-generated method stub
			System.out.println("PayU pay payemt currently it is adapter");
			pi.paymentViaPayU(data);
		}
		
	}

class Client{
	
	void checkOut( PaymentGateway pii,String data) {
		 
		System.out.println("it is in client");
		  pii.pay(data);
		
	}
}


public class Main2 {
	
	public static void main(String[] args) {
		Client c11 = new Client();
		String data = "1000";
		 Razorpay r22 = new  Razorpay();
		RazorpayAdapter r12 = new RazorpayAdapter(r22);
		
		c11.checkOut(r12, data);
		 
	}

}
