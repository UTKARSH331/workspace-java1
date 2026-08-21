

class Address2{
	String name;
	String cityName;
	int cityNo;
	public Address2(String name, String cityName, int cityNo) {
		super();
		this.cityName = cityName;
		this.cityNo = cityNo;
		this.name = name;	
	}
}
class Employee implements Cloneable{
	String branchAddress ;
	String marketName;
	Address2 address;
	public Employee(String branchAddress, String  marketName, Address2 address) {
		this.address = address;
		this.marketName = marketName;
		this.branchAddress = branchAddress;
	}
	public Object Clone() throws CloneNotSupportedException {
		return super.clone();
	}
}
public class Driver2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
