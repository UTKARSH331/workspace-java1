package java_practice_Main_Method_overloading;

public class Un_boxing {
	  public static void main(String[] args) {

	        // ------------------ Autoboxing ------------------
	        int a = 10;              // Primitive variable
	        Integer x = a;           // int -> Integer (Autoboxing)

	        // ------------------ Auto-unboxing ------------------
	        Integer b = 20;          // Wrapper object
	        int y = b;               // Integer -> int (Auto-unboxing)

	        System.out.println("Autoboxing:");
	        System.out.println("Primitive int a = " + a);
	        System.out.println("Wrapper Integer x = " + x);

	        System.out.println();

	        System.out.println("Auto-unboxing:");
	        System.out.println("Wrapper Integer b = " + b);
	        System.out.println("Primitive int y = " + y);
	    }

}
