
public interface ToPower2 {
	void toPower(int a, int b);
}
class Driver8{
	public static void main(String args[]) {
		ToPower2 T2 = (a,b) ->{Math.pow(a, b);};
		T2.toPower(2, 3);
	}
}