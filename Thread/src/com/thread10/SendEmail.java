package com.thread10;

public class SendEmail {
	SendEmail body;
	SendEmail email;
	public SendEmail(SendEmail body, SendEmail email) {
		super();
		this.body = body;
		this.email = email;
	}
	public String sendEmail(SendEmail body, SendEmail email) {
		return "mail sent via kodewala " + "kodewala@gmail.com";
		
	}

}
