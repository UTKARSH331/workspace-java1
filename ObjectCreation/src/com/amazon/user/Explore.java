package com.amazon.user;

public class Explore {
	
	String userName;
	static String userId;
	String type;
	String mobile;
	//iib
	{
		System.out.println("iib-number");
	}
	//sib
	static 
	{
		System.out.println("static-number");
	}
	
	public Explore(String _userId) {
		this("Shy", userId, "premium", "7352639");
	}
	public Explore(String userName, String userId, String string, String string2) {
		super();
		System.out.println("user.user()-2");
		this.userName = userName;
		this.userId = userId;
		this.type = type;
		this.mobile = mobile;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Explore Ex = (mobile)new Explore;

	}

}
// 