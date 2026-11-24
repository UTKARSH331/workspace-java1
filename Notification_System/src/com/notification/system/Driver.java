package com.notification.system;

import java.util.ArrayList;
import java.util.List;

interface INotification{
	String getContent();
}
class SimpleNotification implements INotification{
private String text;
	
	public SimpleNotification(String text) {
	super();
	this.text = text;
}

	@Override
	public String getContent() {
		// TODO Auto-generated method stub
		return text;
	}
	
}
abstract class INotficationDecorator implements INotification{
	INotification n;

	public INotficationDecorator(INotification n) {
		super();
		this.n = n;
	}
}
class TimeStamp extends INotficationDecorator{
	public TimeStamp(INotification n) {
		super(n);
		// TODO Auto-generated constructor stub
	}
	@Override
	public String getContent() {
		return "[12:10:43]" + n.getContent();	
	}
}
class Signature extends INotficationDecorator{
private String sign;
	public Signature(INotification n, String sign) {
		super(n);
		this.n = n;
		this.sign = sign;
		// TODO Auto-generated constructor stub
	}

	@Override
	public String getContent() {
		// TODO Auto-generated method stub
		return "\n-- " + sign + "\n\n" + n.getContent();
	}	
}

// observer pattern start 
interface IObserver{
	void update();
}
 
interface IObservable{
	void addObservor(IObserver ob);
	void removeObservor(IObserver ob);
	void notifyObservor();
}
//
class NotificationObservable implements IObservable{
	private String text;
	private List<IObserver> l1o;
	private INotification currentNotification;
	@Override
	public void addObservor(IObserver ob) {
		if(!l1o.contains(ob)) {
			l1o.add(ob);
		}	
	}
	@Override
	public void removeObservor(IObserver ob) {
		l1o.remove(ob);
	}

	@Override
	public void notifyObservor() {
     for (IObserver observer : l1o)	{
    	 observer.update();
     }
 } 
	public void setContent(INotification n) {
		this.currentNotification = n;
		notifyObservor();
	}
	public String getNotificationContent() {
		return currentNotification.getContent();
	}
}
// logger
class Logger implements IObserver{
NotificationObservable n1;

	public Logger(NotificationObservable n1) {
	super();
	this.n1 = n1;
}

	@Override
	public void update() {
		// TODO Auto-generated method stub
		System.out.println("Logging New Notification : \n" + n1.getNotificationContent() );
	}
	
}
// startegy design pattern 

interface INotificationStrategy{
	void  sendNotification(String content);
}
class EmailStrategy implements INotificationStrategy{
private String emailId;

	public EmailStrategy(String emailId) {
	super();
	this.emailId = emailId;
}
	@Override
	public void sendNotification(String content) {
		System.out.println("sendnotifiaction from email " + emailId + "\n" + content);
	}
	
}
class SMSStartegy implements INotificationStrategy{
private String sms;
	@Override
	public void sendNotification(String content) {
		System.out.println("sms send notifaction : " + sms + "\n" + content);		
	}
}
class POPUPStrategy implements INotificationStrategy{

	@Override
	public void sendNotification(String content) {
		System.out.println("sending popup : " + content);
	}
	
}

class NotificationEngine implements IObserver{
private NotificationObservable nobsl;
private List<INotificationStrategy> lsns = new ArrayList<INotificationStrategy>();
	public NotificationEngine(NotificationObservable nobsl) {
	super();
	this.nobsl = nobsl;
	//this.lsns = new ArrayList<INotificationStrategy>();
}
	@Override
	public void update() {
	String notificationContent = nobsl.getNotificationContent();
	for(INotificationStrategy n1 : lsns) {
		n1.sendNotification(notificationContent);
	}
		
	}
	public void addNotificationStrategy(INotificationStrategy ns) {
		this.lsns.add(ns);
	}
	
}



public class Driver {

}
