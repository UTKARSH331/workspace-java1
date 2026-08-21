package oops8Abstract_abd_interface;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Retail_Users R1 = new Retail_Users();
		R1.placeOrder();
		 Premium_User p1 = new  Premium_User();
		 p1.confirmOrder();
		 Resellers resellers= new Resellers();
		 resellers.confirmOrder();
		 //E_comm_System E1 = new E_comm_System();
	}
}
