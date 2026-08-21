package com.kodewala.String1;

public class StringExp4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "Kodewala Academy";
		String s2 = "kodewala Academy";
		String s3 = "  kodewala Academy  ";
		String s4 = "kodewala, Academy";
	    System.out.println(s1.length());
	    
	    System.out.println(s1.charAt(2));
	    
	    System.out.println(s1.equals(s2));
	    
	    System.out.println(s1.equalsIgnoreCase(s2));
	    
	    System.out.println(s1.indexOf("A"));
	    
	    System.out.println(s1.lastIndexOf("K"));
	    
	    System.out.println(s1.substring(4));
	    
	    System.out.println(s1.substring(5, 9));
	    
	    System.out.println(s1.toUpperCase());
	    
	    System.out.println(s3.trim());
	    
	    System.out.println(s1.replace("w", "v"));
	    
	    System.out.println(s1.replace("a", "b"));
	    
	    System.out.println(s4.split(","));
	    
	    System.out.println(s1.contains("de"));
	    
	    System.out.println(s1.startsWith("Kode"));
	    
	    System.out.println(s1.endsWith("my"));
	    
	    System.out.println( s1.toCharArray());
	    
	    System.out.println(s1.indexOf("A"));
	    

	}

}
