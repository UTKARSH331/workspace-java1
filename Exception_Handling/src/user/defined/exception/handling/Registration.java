package user.defined.exception.handling;

public class Registration {
	public boolean doRegistration(String _userId) throws UserAlreadyExistException {
		System.out.println("registration.doRegistration() Start......");
		boolean status = false;
		boolean isUserAlready = true;
		if(!isUserAlready) {
			System.out.println("registering the user..." + _userId);
			status = true;
		} else {
			System.out.println("user is already available ...." + _userId);
			throw new UserAlreadyExistException("user is already exists ");
		}
		return status;
	}
	

}
