package oops6practice;

public class UserRegistration {
	public static void doSomething(String name, int roll) {
		System.out.println("dpSomething String name, int roll  ");
		return ;
	}
	private static void doSomething(String name, int roll, int adharNo) {
		System.out.println("dpSomething String name, int roll  ");
		return ;
	}
	public void doSomething(int roll,String name) {
		System.out.println("dpSomething String name, int roll  ");
		return ;
	}
	public void doSomething(int roll,String name, String name1) {
		System.out.println("dpSomething String name, int roll  int roll,String name, String name1 ");
		return ;
	}
	public int doSomething(int roll,String name, String name1 , String name2) {
		System.out.println("dpSomething   int roll,String name, String name1, String name2 ");
		return 0;
	}
	private void doSomething(int roll) {
		System.out.println("dpSomething int roll ");
		return ;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
		UserRegistration U1 = new UserRegistration();
				U1.doSomething(121, "Suman");
				U1.doSomething(121, "ram", "Shayam");
				UserRegistration.doSomething("suman", 121, 1211);
				U1.doSomething(121, null, null, null);
				U1.doSomething(121);

	}
}
