package java_practice_Main_Method_overloading;

public class Auto_Boxing {
	static int x = 10;
	Integer y = x;
	
	public static void main(String args[]){
		System.out.println("System.out.println(\"x\" + x );" + x); // Auto_Boxing
	}

}
// in old java Integer y = new Integer(x);
// in new java Integer y = Integer.value of (x); // it uses caching internaly
/*
 * 
 */
/*
 approx showing how it seems in Integer class  
class Integer{
	static Integer value of(int x) {
		// somethings
	}
	int intValue() {
		return value;
	}
	
}
*/