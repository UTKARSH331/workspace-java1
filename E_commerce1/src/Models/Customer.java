package Models;

public class Customer {

	private int customerId;
	private String customerName;
	private String email;
	private String mobile;
	private String address;
	private String password;
	public Customer(int customerId, String customerName, String email, String mobile, String address, String password) {
		super();
		this.customerId = customerId;
		this.customerName = customerName;
		this.email = email;
		this.mobile = mobile;
		this.address = address;
		this.password = password;
	}
	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String toString() {
		 return "Customer ID : " + customerId +
	                "\nName        : " + customerName +
	                "\nEmail       : " + email +
	                "\nMobile      : " + mobile +
	                "\nAddress     : " + address;
	}
	
	
}
