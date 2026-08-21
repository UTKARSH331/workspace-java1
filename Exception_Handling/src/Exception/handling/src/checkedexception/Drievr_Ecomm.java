package Exception.handling.src.checkedexception;

public class Drievr_Ecomm {
	public void ecoomerce_Order(int items, int qty) throws Exception{
		if(items <0 && qty < 0) {
		}else {
				System.out.println("items found" + items);
				System.out.println("qty accurate" + qty);
		}
	}
}
