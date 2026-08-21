package interface4;

public interface IDiscount {
	int apply(int amount, int disc);

}
class Driver77{
	public static void main(String args[]) {
		IDiscount iDiscount = (amt, dis) -> {int result = amt*dis/100; return result;};
		int c = iDiscount.apply(100, 10);
		System.out.println(c);
	}
}
