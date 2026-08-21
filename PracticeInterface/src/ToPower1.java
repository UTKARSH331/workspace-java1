
public interface ToPower1 {
	int topower(int a, int b);
}
class Driver7{
	public static void main (String args[]) {
		ToPower1 T1 = (a,b) ->{
			return (int) Math.pow(a, b);
		};
		T1.topower(2, 2);
	}
}
