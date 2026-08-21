
public class User1TryCatchExecption {
	public static void main(String[] args, String userName, String userId) {
	 
			String userId1 = null;
			try {
				String country = "In";
				System.out.println("User.createUser().... country is " + country);
				userId1 = userName.substring(0, 5) + "123";
				System.out.println("Driver.createUser().... and generateId user Id : " + userId + "End");
			} catch (ArithmeticException e) {
				e.printStackTrace();
				System.out.println("no can not be zero ");
			} catch (NullPointerException e) {
				e.printStackTrace();
				System.out.println("user name is null");
			} catch (Exception e) {
				e.printStackTrace();
				System.out.println("E.printstack....");
				e.printStackTrace();
			} finally {
				System.out.println("closed the application ");
			}
			System.out.println("Driver.createUser()....End");
		
	}

}
