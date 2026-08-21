package com.ExceptionHandling;

public class Test {

	public static void main(String[] args) {
		String name = null;
		//String numstr = args[0];
	//	int amount = Integer.parseInt(numstr);
		int roll_no = 121;
	//	System.out.println("name.length" + name.length());
		System.out.println("roll_no " + roll_no);
	//	System.out.println("amount " + amount);
		try {
			System.out.println("before execution " );
			System.out.println(name.length());
			System.out.println("after execution" );
		}
		catch (NullPointerException e) {
			e.printStackTrace();
			System.out.println("name is null");
			// TODO: handle exception
		}
		catch (ArithmeticException e){
			e.printStackTrace();
			System.out.println("ArithmeticException e");
		} catch(Exception c) {
			c.printStackTrace();
			System.out.println("catch(Exception c)");
		}
		System.out.println("this is the end of program");

	}

}
