package com.amazon.user;

public class Count_number {
	public static int totalViewers = 0;
	private String userName;
	private String userId;
	
	
	// sib
	static {
		
		System.out.println("static-number ");
		
		
	}
	
	//iib
	{
		System.out.println("iib-");
		totalViewers += totalViewers;
	}
	
	public Count_number (String _userId){
		
		this("guest_user", _userId);
		System.out.println("user.user() - 1");	
	}
	public Count_number(String username, String userId) 
	{
		super();
		System.out.println("user.user()-2");
		this.userName = userName;
		this.userId = userId;
		
	}

	
}
