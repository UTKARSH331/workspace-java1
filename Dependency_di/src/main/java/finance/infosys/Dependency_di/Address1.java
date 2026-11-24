package finance.infosys.Dependency_di;

public class Address1 {
	String line;
	String address;
	String city;
	String state;
	public Address1(String line, String address, String city, String state) {
		super();
		this.line = line;
		this.address = address;
		this.city = city;
		this.state = state;
	}
	
	public String displayAddress1(){
		return "Address1 [line=" + line + ", address=" + address + ", city=" + city + ", state=" + state + "]";
	}
	
	

}
