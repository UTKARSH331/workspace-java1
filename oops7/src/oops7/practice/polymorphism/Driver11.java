package oops7.practice.polymorphism;

public class Driver11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Notification  N1 = new Notification ();
		NotificationProcessorSystem NP1 = new NotificationProcessorSystem();
		NP1.doSendNotification(new EmailNotification());

	}

}
