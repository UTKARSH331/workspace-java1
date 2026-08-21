
public class ArithimaticException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			int a = 100/0;
			System.out.println("try_block " + a);
			
			
		} catch (Exception e){
			System.out.println("catch_Block ");
			e.printStackTrace();
		}

	}

}
