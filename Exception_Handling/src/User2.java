
// this is for the education purpose only? to find the child of  exception class is not working after the exception class is declared as a catch thats why 
public class User2 {
	public static void main(String[] args, String userName) {
		String userId = null;
		try {
			String country = "In";
			System.out.println("User.createUser().... country is " + country);
			userId= userName.substring(0,5) + "123";
			System.out.println("it has a end " + userId);
		} catch (Exception e) {
			System.out.println("here we write first exception ");
			e.printStackTrace();
		} catch(NullPointerException e) {
			System.out.println("user.after ");
			
		}
		
	}

}
