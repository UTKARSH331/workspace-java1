package finance.infosys.dependency_injection;

public class Address1 {
	String line1;
	String line2;
	String address;
	String mainAddress;
	public Address1(String line1, String line2, String address, String mainAddress) {
		super();
		this.line1 = line1;
		this.line2 = line2;
		this.address = address;
		this.mainAddress = mainAddress;
	}
	//@Override
	public String displayAddress1() {
		return "Address1 [line1=" + line1 + ", line2=" + line2 + ", address=" + address + ", mainAddress=" + mainAddress
				+ "]";
	}
	
	

}
