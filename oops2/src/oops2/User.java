package oops2;

public class User extends Usermngmt
{
	public static void main(String args[]) {
		User user = new User();
		System.out.println( "user.type(); " + user.type );
		//user.type();
		System.out.println("user.location " + user.location);
		user.doSomething();
	}

}
