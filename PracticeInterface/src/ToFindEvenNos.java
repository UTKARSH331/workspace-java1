
public interface  ToFindEvenNos {
	int evenNos(int a);
}
class Driver{
	public static void main(String args[]) {
		ToFindEvenNos E1 = a -> {
			if(a % 2 == 0) {
				System.out.println(a + "is Even ");
			} else {
				System.out.println(a + "is odd");
			}
			return a;
		};
		int ans = E1.evenNos(12);
		System.out.println(ans);
	}
}
