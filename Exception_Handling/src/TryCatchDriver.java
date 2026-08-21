
public class TryCatchDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("main Start ");
		try 
		{
			String name = null;
			System.out.println("tryCatch NullPointerException " + name.length());
			TryCatchDriver D1 = new TryCatchDriver();
			D1.doSomething();
		} catch(NullPointerException e) {
			System.out.println("Exception : Name is null ");
			e.printStackTrace();
			TryCatchDriver D2 = new TryCatchDriver();
			D2.doSomethingForCatch();
		}
		

	}
	public void doSomething() {
		System.out.println("Start doSomething Method from here ");
		
		System.out.println("end doSomething Method from here");
	}
	public void doSomethingForCatch() {
		System.out.println("Start doSomethingForCatch() after nullpointerException");
	}

}
