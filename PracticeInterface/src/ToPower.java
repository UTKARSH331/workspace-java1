
public interface ToPower {
	int power(int a, int b);
}
class Driver5{
	public static void main(String args[]) {
		ToPower P1 = (a,b) -> {
			return (int ) Math.pow(a, b);	
		};
		P1.power(2, 3);
		
		//Substract S2 = (a,b) -> {int mul = a*b; return mul;};
	}
}
