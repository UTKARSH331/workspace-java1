package oops7.practice.polymorphism;

public class NotificationProcessorSystem  {
	public void doSendNotification(Notification N1) {
		N1.sendNotificationMethod();
		System.out.println("NotificationProcessorSystem  ");
	}

}
