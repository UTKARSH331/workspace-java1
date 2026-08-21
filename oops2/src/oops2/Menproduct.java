package oops2;

public class Menproduct extends Clothproduct{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Menproduct men = new Menproduct();
		System.out.println("men clothsize " + men.clothSize);
		System.out.println("men clothsize " + men.ClothColour);
		System.out.println("men product_name " + men.product_name);
		men.doAll();
		men.doParcel();
	}

}

 class Womenproduct extends Clothproduct{
	
	public static void main(String args[]) {
		Womenproduct women = new Womenproduct();
		System.out.println("women clothSize1 " + women.clothSize1);
		System.out.println("women clothColour " + women.clothColour);
		women.doAll();
		women.doParcel();
	}
	
}