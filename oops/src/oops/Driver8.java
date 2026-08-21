package oops;

public class Driver8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Notification N1 = new PushNotification();
		N1.sendNotification();
		N1 = new EmailNotification();
		N1.sendNotification();
		N1 = new SmsNotification();
		N1.sendNotification();
        N1 = new Notification();
        N1.sendNotification();
        ProcessNotificationSysytem process = new  ProcessNotificationSysytem();
        N1 = new WhatsappNotification();
        process.ProcessNotificationSysytem(N1);
	}
}
