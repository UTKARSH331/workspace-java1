
 class ZOMATOdelievery {
	int Items;
	String ItemName;
	public ZOMATOdelievery (int Items, String ItemName) {
		
		this.Items = Items;
		this.ItemName = ItemName;
		}
	
 public static void main(String[] args) {
		// TODO Auto-generated method stub
	ZOMATOdelievery Zomato = new ZOMATOdelievery(5, "maggi");
	System.out.println("Zomato " + Zomato.Items);
	System.out.println("Zomato ItemsName " + Zomato.ItemName);
	}

}
