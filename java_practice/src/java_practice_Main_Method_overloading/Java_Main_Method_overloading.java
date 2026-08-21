package java_practice_Main_Method_overloading;

public class Java_Main_Method_overloading {

	
	public static void main(String s) {
		System.out.println("main method String s overloading");
	}
	
	public static void main(int x) {
		System.out.println("main method int x overloading ");
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("main method Overloading");
	}
	 int age = -10;
	 if(age <0) {
		 System.err.println( "invalid_age");
	 }
}


class Abc{
	public void main(String args[]) {
		System.out.println("main method Without static");
	}
}