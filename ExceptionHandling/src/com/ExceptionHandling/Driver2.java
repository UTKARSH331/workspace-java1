package com.ExceptionHandling;
// interview questions
public class Driver2 {
	
	public static void main(String[] args) {
		Driver2 d1 = new Driver2();
	int result =	d1.calcDiscount(100, 10);
		System.out.println(result);
		
	}
	
	private int calcDiscount(int amount, int discount) {
		int finalAmount = 0;
		try {
			finalAmount = amount - (amount * discount/100); // risky ?
			return finalAmount;
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("catch exception in catch block");
			e.printStackTrace();
		}
		finally {
			finalAmount = 110;
		//	return finalAmount;
			// finnaly block only override when it have return vajue in his block
		}
		return finalAmount;
	}

}
