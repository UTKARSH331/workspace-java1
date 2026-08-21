
public class ArrayIndexOutOfBoundsException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			String name = args[0];
			System.out.println(" String name = args[0 ] this type of exception " + name.length());
		} catch(Exception a) {
			int ab= 100;
			System.out.println("Start main ArrayIndexOutOfBoundsException exception " );
			System.out.println("ArrayIndexOutOfBoundsException exception " + ab );
			a.printStackTrace();
		}

	}

}
