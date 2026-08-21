
public class Driver12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Driver12 driver12 = new Driver12();
		try 
		{
			Class.forName("com.kodewala.exception.Order");
		}
		catch(ClassNotFoundException e) {
			e.printStackTrace();
		}

	}

}
