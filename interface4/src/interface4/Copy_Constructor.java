package interface4;

public class Copy_Constructor {
	String name;
	String City;
	public Copy_Constructor(String name, String City) {
		this.name = name;
		this.City = City;
		// TODO Auto-generated constructor stub
	}
	//Copy_constructor
	public Copy_Constructor(Copy_Constructor c) {
		this.name = c.name;
		this.City = c.City;
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Copy_Constructor C11 = new Copy_Constructor("Utk", "Blr");
		//Copy_Constructor
		Copy_Constructor c22 = new Copy_Constructor(C11);
		System.out.println("C11.name"+C11.name + " C11.City " + C11.City );
        System.out.println("c22.name " + c22.name + "c22.City " + c22.City);
	}

}
