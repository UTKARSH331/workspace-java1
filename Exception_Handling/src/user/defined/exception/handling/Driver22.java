package user.defined.exception.handling;

public class Driver22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Registration R1 = new Registration();
		try {
			R1.doRegistration("Utk");
		} catch (UserAlreadyExistException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
