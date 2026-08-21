package interface4;

import java.io.Serializable;

public class Account231 implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public Account231(String string, int i, String string2, String name, int Email_Id, String address) {
		// TODO Auto-generated constructor stub
		this.name = name;
		this.Email_Id = Email_Id;
		this.address = address;
	}
	public Account231(String string, double d) {
		// TODO Auto-generated constructor stub
	}
	public Account231(String string, int i, String string2) {
		// TODO Auto-generated constructor stub
	}
	public String getName() {
		return name;
	}
	public int getEmail_Id() {
		return Email_Id;
	}
	public String getAddress() {
		return address;
	}
	String name;
	int Email_Id;
	String address;

}
