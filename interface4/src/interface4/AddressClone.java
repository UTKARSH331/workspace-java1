package interface4;

public class AddressClone implements Cloneable {
	String line1;
	public AddressClone(String line1) {
		super();
		this.line1 = line1;
	}
	public Object Clone() throws CloneNotSupportedException {
		return super.clone();
	}
}
class Employee12122 implements Cloneable {
	String name;
	AddressClone address;
	public Employee12122(String name, AddressClone address) {
		super();
		this.name = name;
		this.address = address;
	}
	public Object Clone() throws CloneNotSupportedException {
		return super.clone();
	}
}
class Driver212{
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
