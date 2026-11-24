package OrderHistory1.one_loan;

import java.sql.SQLException;

public class Driver {
	
	public static void main(String[] args) {
		products ph1 = new products();
		
		try {
			ph1.getProductHistory();
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
