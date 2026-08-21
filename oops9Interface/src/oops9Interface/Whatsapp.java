package oops9Interface;

interface Whatsapp {
	int doSomething = 2;
	static final int doNotdoAnything = 12;
	void doconnect();
}
interface instagram extends InterfacePrivateNotification{
	public default void doSomething() {
		System.out.println("saved thye photos of instagram ");	
	}	
}
