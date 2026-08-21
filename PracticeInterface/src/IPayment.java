
public interface IPayment {
      // void pay(int amount, String accNo);
      int add (int a, int b);
}
interface Substract{
	int sub(int a, int b);
}
/*class Driver implements IPayment{

	@Override
	public int add(int a, int b) {
		int sum = a+b;// TODO Auto-generated method stub
		return sum ;
	}
	
}*/
class Driver1 {
	public static void main(String args[]) {
		 IPayment S1 = (a,b) -> a+b;
		 int sum = S1.add(12, 10);
		 System.out.println(sum);
	}
}
class Driver3{
	public static void main(String args[]) {
		Substract S1 = (a,b) -> a-b;
		int sub = S1.sub(12, 10);
		System.out.println(sub);
	}
}
class Driver4{
	public static void main(String args[]) {
		Substract S2 = (a,b) -> {int mul = a*b; return mul;};
		int mul = S2.sub(2, 30);
	}
}
