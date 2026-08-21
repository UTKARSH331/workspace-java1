package java_practice_Main_Method_overloading;
/*2. What is an enum?
enum is a special data type in Java.
It is used to define a fixed set of named constants.
*/
public class Enums {
	public static void main(String args[]) {
		PaymenyStatus s1 = PaymenyStatus.SUCCESS;
		System.out.println(s1.name());
		System.out.println(s1.hashCode());
		System.out.println(s1.compareTo(s1));
		System.out.println(s1.ordinal());
		System.out.println(s1.toString());
		System.out.println(s1.ordinal());
		System.out.println(s1.valueOf(null));
		System.out.println(s1.values());
	}
}
enum PaymenyStatus{
	SUCCESS,
	FAILED,
	PENDING;
	@Override
	public String toString() {
		return this.name() + "Direction ";
	}
}
