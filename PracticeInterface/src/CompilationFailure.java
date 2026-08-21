           
public class CompilationFailure {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name = null;
		try
		 {
			System.out.println("before execution " );
			System.out.println(name.length());
			System.out.println("after execution" );
		} catch(Exception e) {
			e.getStackTrace();
			System.out.println("this is come under catch");
		}
		System.out.println("this is the end of program");

	}

}
