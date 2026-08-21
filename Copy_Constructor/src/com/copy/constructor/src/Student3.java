package com.copy.constructor.src;

public class Student3 {
	
		String name;
		int roll;
		
		Student3(){
			this(121, "rahul");//user defiened- no arguments constructor 
			System.out.println("user defiened- no arguments constructor  " );
		}
		Student3(int roll, String name){
			this.roll = roll ;
			this.name = name ;
			System.out.println("constructor parameterized constructor " + roll + name);
		}

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Student3 s1= new Student3();
			s1 = new Student3();
		}
	}
