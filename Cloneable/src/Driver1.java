

class Address {
	int City;
	public Address(int city) {
		super();
		this.City = city;
	}	
}
class Employee32 implements Cloneable{
	String name;
	Address  address;
	public Employee32(String name, Address address) {
		this.name = name;
		this.address = address;
	}
	public Object Clone() throws CloneNotSupportedException {
		return super.clone();
	}
}
public class Driver1 {

	public static void main(String[] args) throws CloneNotSupportedException {
		Address address = new Address(100);
		// TODO Auto-generated method stub
		Employee32 e1 = new Employee32("utk", address);
		Employee32 e2 = (Employee32) e1.Clone();
		e2.address.City= 121;
		System.out.println("original Obj : " + e1.name);
		System.out.println("original Obj : " + e1.address);
		System.out.println("cloned Obj : " + e2.name);
		System.out.println("cloned Obj : " + e2.address);

	}

}
