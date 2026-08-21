package oops9Interface;

public class DriverInterfacePrivateNotification implements Whatsapp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InterfacePrivateNotification I1 = new Fb();
		I1.doNotify();
		I1.sendMail();
		I1.sendSms();
		//Whatsapp.doSomething;
	//	InterfacePrivateNotification.doSomething;
		InterfacePrivateNotification.dNotConnectToDb();

	}

	@Override
	public void doconnect() {
		// TODO Auto-generated method stub
		
	}

}
