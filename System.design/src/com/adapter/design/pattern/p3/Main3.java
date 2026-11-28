package com.adapter.design.pattern.p3;


interface NotificationService{
	void sendNotificationService(String data);
}

class SMS{
	void sendSMS(String data) {
		System.out.println("it throws a notification from sms : " + data);
	}
}
class Email{
	void sendEmail(String data) {
		System.out.println("it throws a notification from Email : " + data);
	}
	
}
class Whatsapp{
	void sendWhatsapp(String data) {
		System.out.println("it throws a notification from Whatsapp : " + data);
	}
	
}
class Api{
	
	void sendApis(String data) {
		System.out.println("it throws a notification from Apis : " + data);
	}
	
}
class SMSAdapter implements NotificationService{
	private SMS s1;

	 

	public SMSAdapter(SMS s1) {
		super();
		this.s1 = s1;
	}

	@Override
	public void sendNotificationService(String data) {
		// System.out.println("it is in sms adapter : " + data);
		s1.sendSMS(data);
		
	}
	
}
class EmailAdapter implements NotificationService{
	 private Email e1;
	 

	public EmailAdapter(Email e1) {
		super();
		this.e1 = e1;
	}
	@Override
	public void sendNotificationService(String data) {
		 //System.out.println("it is in sms Email : " + data);
		e1.sendEmail(data);
		
	}
	
}

class WhatsappAdapter implements NotificationService{
	 private Whatsapp w1;
	 
	public WhatsappAdapter(Whatsapp w1) {
		super();
		this.w1 = w1;
	}

	@Override
	public void sendNotificationService(String data) {
		// System.out.println("it is in sms Whatsapp : " + data);
		w1.sendWhatsapp(data);
		
	}
	
}

class ApiAdapter implements NotificationService{
	private Api a1;
	public ApiAdapter(Api a1) {
		super();
		this.a1 = a1;
	}
	@Override
	public void sendNotificationService(String data) {
		// System.out.println("it is in sms Api : " + data);
		a1.sendApis(data);
	}
	
}

class  client22{
	void checkOut(NotificationService notif, String data) {
		  notif.sendNotificationService(data);
	}
}


public class Main3 {
	public static void main(String[] args) {
		client22 c21 = new client22();
		String data = "hello";
		SMS s11 = new SMS();
		 NotificationService n11 = new SMSAdapter (s11);
		 c21.checkOut(n11, data);
		 
	}

}
