package Exception.handling.src.checkedexception;

public class User1 {
	public String createUser(String userName, String password) throws  Exception{
		System.out.println("Driver.createUser()...Start");
		String userId = null;
		try {
			String country = "IN";
			System.out.println("User.createUser()..." + country);
			userId = userName.substring(0, 5) + "123";
			System.out.println("Driver.createUser()... and generated user Id: " + userId + "End");
		} catch (Exception e) {
			
			System.out.println("User.createUser()....closing the connection... ");	
			throw new Exception("it will throw exception in NullPointerException");
		
			
		} finally {
			System.out.println("close the exception after finally ");
		}
		System.out.println("Drievr.createUser() End");
		return userId;
	}

}
