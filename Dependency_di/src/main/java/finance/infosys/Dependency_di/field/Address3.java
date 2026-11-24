package finance.infosys.Dependency_di.field;

public class Address3 {
	String line11;
	String city;
	String district;
	public Address3(String line11, String city, String district) {
		super();
		this.line11 = line11;
		this.city = city;
		this.district = district;
	}
	//@Override
	public String displayAddress() {
		return "Address3 [line11=" + line11 + ", city=" + city + ", district=" + district + "]";
	}
	
	
	

}
