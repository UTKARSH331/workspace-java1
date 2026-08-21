package Exception.handling.src.checkedexception;

public class Driver22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		User1 u2 = new User1();
		String userId = "UTK";
		try {
			userId = u2.createUser(null, "test98****88(");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("message will display here if exception came in catch of NullPointer "+e.getMessage());
			e.printStackTrace();
		}
		System.out.println("User Id is...."+userId);

	}

}
