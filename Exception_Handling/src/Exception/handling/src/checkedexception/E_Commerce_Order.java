package Exception.handling.src.checkedexception;

public class E_Commerce_Order {

	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		String items;
		String qtystr = args[1];
		int qty = Integer.parseInt(qtystr);
		try {
			System.out.println("order is placesd" + null);
			System.out.println("no of order "+ qty);
		} catch (NullPointerException e) {
			e.printStackTrace();
			System.out.println("no items is here ");
		}catch( ArrayIndexOutOfBoundsException e) {
		e.printStackTrace();
		System.out.println("no elements is found ");
		}
	}
}
