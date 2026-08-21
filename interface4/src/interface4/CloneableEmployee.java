package interface4;

public class CloneableEmployee implements Cloneable{

	String name;
	String location;
	public CloneableEmployee(String name, String location) {
		super();
		this.name = name;
		this.location = location;
	}@Override
	public Object clone() throws CloneNotSupportedException{
		return super.clone();
		
	}
}
 class Driver {
	public static void main (String args[]) throws CloneNotSupportedException{
		CloneableEmployee E1 = new CloneableEmployee("Ajay " , "BLR"); // created an object 
		CloneableEmployee E2 = (CloneableEmployee) E1.clone();//
		System.out.println("E2.location " + E2.location + " " + E2.name);
		
	}
}
