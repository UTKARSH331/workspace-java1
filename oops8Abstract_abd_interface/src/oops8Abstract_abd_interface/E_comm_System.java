package oops8Abstract_abd_interface;

public abstract class E_comm_System {
	
	public abstract void placeOrder();
	public abstract void edit();
	public abstract void order();
	public abstract void confirmOrder(); 
	//public int doJob() {
		//System.out.println("doJob in abstract class ");
	//}
}
class Retail_Users extends  E_comm_System{
	@Override
	public  void placeOrder() {
		System.out.println(" Retail_Users PlaceOrder ");
	}
	@Override
	public void edit() {
		System.out.println("Retail_Users Edit ");
	}
	@Override
	public void order() {
		System.out.println(" Retail_Users order");
	}
	@Override
	public void confirmOrder() {
		System.out.println("Retail_Users confirmOrder ");
	}
}
class Premium_User extends  E_comm_System {
	@Override
	public  void placeOrder() {
		System.out.println("Premium_User paceOrder ");
	}
	@Override
	public void edit() {
		System.out.println(" Premium_User edit ");
	}
	@Override
	public void order() {
		System.out.println("Premium_User order");
	}
	@Override
	public void confirmOrder() {
		System.out.println("Premium_User confirmOrder ");
	}
}
class Resellers extends E_comm_System{
	@Override
	public  void placeOrder() {
		System.out.println("Resellers paceOrder ");
	}
	@Override
	public void edit() {
		System.out.println("Resellers edit ");
	}
	@Override
	public void order() {
		System.out.println("Resellers order");
	}
	@Override
	public void confirmOrder() {
		System.out.println("Resellers confirmOrder ");
	}
}
class FinalSellers extends E_comm_System{

	@Override
	public void placeOrder() {
		// TODO Auto-generated method stub
		System.out.println("placeOrder via FinalSellers");
		
	}

	@Override
	public void edit() {
		// TODO Auto-generated method stub
		System.out.println("edit via FinalSellers ");
		
	}

	@Override
	public void order() {
		// TODO Auto-generated method stub
		System.out.println("order() via FinalSellers");
		
	}

	@Override
	public void confirmOrder() {
		// TODO Auto-generated method stub
		System.out.println("confirmOrder() via FinalSellers");
		
	}
}


