package Exception.handling.src.checkedexception;

public class D2Ecomm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Drievr_Ecomm E1 = new Drievr_Ecomm();
		
		try {
			E1.ecoomerce_Order(-1, -22);
		} catch (Exception e) {
			System.out.println();
			e.printStackTrace();
		}

	}

}
