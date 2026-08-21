
public class User4 {
	public static int getValue() {
		try {
			System.out.println("inside the try");
			return 10;
		} finally{
			System.out.println("inside the catch");
			return 20;
		}
	}
	public static void main(String args[]) {
		//int result = getValue();
		System.out.println(getValue());
		
	}
}

