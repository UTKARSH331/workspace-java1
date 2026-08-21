package com.hotstar;

public class HotstarFunction {
	
	public static int totalviews = 0;
	
	private String userName;
	private String userId;
	private String emailId;
	private String mobileNo;
	
	
	{
		System.out.println("instance init block");
	}
	
	
	static 
	{
		totalviews++;
		System.out.println("sattic init block" + totalviews);
	}
	
	public HotstarFunction(String userId) 
	{
		this("guest_user",userId, "HotstarFunction", "4565656");
		System.out.println("user-1 block");
	}
	
	
	
	
	public HotstarFunction(String username, String userId, String emailId, String mobileNo) 
	{
		super();
		System.out.println("user- 2 block");
		this.userName = username;
		this.userId = userId;
		this.emailId = emailId;
		this.mobileNo = mobileNo;
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HotstarFunction ankit = new HotstarFunction("fghvgvh");
		HotstarFunction ram = new HotstarFunction("gvfhgvh", "hgfhg", "ghfhf", "765576");
		System.out.println("totalviews" + HotstarFunction.totalviews);

	}

}
