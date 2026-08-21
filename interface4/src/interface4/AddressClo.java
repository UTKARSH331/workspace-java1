package interface4;

public class AddressClo implements Cloneable {
	String line1;
	public AddressClo(String line1) {
		super();
		this.line1 = line1;
	}
	public Object Clone() throws CloneNotSupportedException {
		return super.clone();
	}
}
class Employee121221 implements Cloneable {
	String name;
	AddressClo address;
	public Employee121221(String name, AddressClo address) {
		super();
		this.name = name;
		this.address = address;
	}
	public Object Clone() throws CloneNotSupportedException {
		return super.clone();
	}
}
class Driver2121{
	public static void main(String[] args) throws CloneNotSupportedException 
	{
		Employee12122 e1 = new Employee12122 ("Utk", new AddressClone("Btmlayout"));
		Employee12122 e2 = (Employee12122) e1.Clone();
		System.out.println("e2.name... " + e2.name);
		e2.address.line1 = "Test_page";
		System.out.println(e1.name);
		System.out.println(e2.address.line1);
		System.out.println(e1.name);
		System.out.println(e1.address.line1);

	}

}
