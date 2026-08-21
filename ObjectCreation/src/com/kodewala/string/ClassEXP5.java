package com.kodewala.string;

public class ClassEXP5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	String s1 = "hello"; // scp
	
	String s2 = new String ("hello");
	String s3 = s1 + s2; // heap dasfg
	
	System.out.println(s1);// 1 object and in scp
	System.out.println(s2); // 1object and 1 in heap and 1 in scp refrences
	System.out.println(s3); // heap and 1 object 
	
	String s5 = s3.intern(); // hellohello //Scp   sgfdhj
	
	
	System.out.println(s3 == s5); 

//		
//  String 	 a = "Kodewala";
//  String b = " Academy";
//  
//  String c = a+b;
//  String e = c.intern();
//  String d = "Kodewala Academy";
//  
//  System.out.println(c == e);
//  
//	}

}
}
