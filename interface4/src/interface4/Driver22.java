package interface4;

class Address1{
	String city;
	public Address1(String city) {
		super();
		this.city = city;
	}
}
class Employee121 implements Cloneable{
	String city;
	Address1 address;
	public Employee121(String city, Address1 address) {
		super();
		this.city = city;
		this.address = address; 
	}
	public Object clone() throws CloneNotSupportedException{
		return super.clone();
	}
}

public class Driver22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
