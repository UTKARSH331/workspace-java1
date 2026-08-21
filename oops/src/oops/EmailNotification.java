package oops;

public class EmailNotification extends Notification {
	@Override
	public void sendNotification() {
		System.out.println("notification send from EmailNotification class ");
	}
}
