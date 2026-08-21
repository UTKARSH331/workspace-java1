package com.amazon.user;

public class User {

private String userName;
private String userId;
private String mobile;
private String email;
private Object _user;
private Object user;

public User (String _userId) 
{
	this("guest_user", user.Id, "00000000", "abc@xyz.com");
	System.out.println("user.user() - 1");
}

public User (String userName, String userId, String mobile, String email ) 
{
	super();
	System.out.println("user.user()-2");
	this.userName = userName;
	this.userId = userId;
	this.mobile = mobile;
	this.email = email;
}

}
