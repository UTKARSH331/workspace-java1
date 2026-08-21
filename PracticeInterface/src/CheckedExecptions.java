
public class CheckedExecptions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name = "";
		try {
			Class.forName("known by the compiler ");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
