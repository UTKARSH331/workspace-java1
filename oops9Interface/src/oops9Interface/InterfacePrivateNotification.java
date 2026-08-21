package oops9Interface;

interface InterfacePrivateNotification {
	default void sendMail() {
		connectToDb();
		System.out.println("notification send in InterfacePrivateNotification sendMail()");		
	}
	default void sendSms() {
		connectToDb();
		System.out.println("notification send in InterfacePrivateNotificatio via sendSms() ");
		
	}
	void doNotify();
	private void connectToDb() {
		System.out.println("connectToDb() ");
	}
	static void dNotConnectToDb() {
		System.out.println("dNotConnectToDb()");
	}
	int doSomething = 1;
	//int doSomething = 0;
	//int doSomething = 0;
}

class Fb implements InterfacePrivateNotification {

	@Override
	public void doNotify() {
		InterfacePrivateNotification.dNotConnectToDb();
		System.out.println("");
	}
	public  void sendSms() {
		InterfacePrivateNotification.dNotConnectToDb();
		System.out.println("notification send in Fb via sendSms() ");
	}
	public void sendMail() {
		InterfacePrivateNotification.dNotConnectToDb();
		System.out.println("notification send in Fb  sendMail()");		
	}
}

