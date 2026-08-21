package interface4;
@FunctionalInterface
public interface  IDiscount1 {
	int apply(int amount, int disc);
}
@FunctionalInterface
interface IDiscount2 extends IDiscount1{
	int apply(int amount, int disc);
	
}
class Driver32{
	public static void main (String args[]) {
		IDiscount2 iIDiscount2 = (amt,dis) ->{int result = (amt*dis/100); return result;};
		System.out.println(iIDiscount2.apply(120, 10));
	}
}
