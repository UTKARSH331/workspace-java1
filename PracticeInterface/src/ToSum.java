
public interface ToSum 
{
void tosum(int a, int b);	

}
class Driver9{
	public static void main(String args[]) {
		ToSum  T9 = (a,b) -> {int sum = (a+b);};
		T9.tosum(2, 30);
	}
}
