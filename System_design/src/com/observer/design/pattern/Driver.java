package com.observer.design.pattern;

import java.util.ArrayList;

interface ISubscriber{
	void update();
}
interface IChanel{
	void addSubscriber(ISubscriber subscriber);
	//void removeSubscriber();
	void removeSubscriber(ISubscriber subscriber);
	void notifySubscriber();
}

class chanel implements IChanel{

	private String name;
	private String latestVideo;
	private ArrayList<ISubscriber> s1;
	
	
	public chanel(String name) {
		super();
		this.name = name;
		s1 = new ArrayList<ISubscriber>();
	}

	@Override
	public void addSubscriber(ISubscriber subscriber) {
		if(!s1.contains(subscriber)) {
			s1.add(subscriber);
		}
		
	}

	@Override
	public void removeSubscriber(ISubscriber subscriber) {
		// TODO Auto-generated method stub
		s1.remove(subscriber);
		
	}

	@Override
	public void notifySubscriber() {
		// TODO Auto-generated method stub
		for(ISubscriber sub : s1) {
			sub.update();
		}
		
	}
	public void UploadVideos(String types) {
		latestVideo = types;
		notifySubscriber();
		System.out.println("video is uploaded " + latestVideo);
		
	}
	public String getVideos() {
		return "\ncheckout our new videos " + latestVideo + "\n";
	}
	
}

class Subscriber implements ISubscriber{
	private String name;
	private chanel chanel;
	

	public Subscriber(String name, chanel chanel) {
		super();
		this.name = name;
		this.chanel = chanel;
	}


	@Override
	public void update() {
		System.out.println("new videos " + chanel.getVideos());
		
	}	
}
public  class Driver{ 
	public static void main(String[] args) {
		
		chanel pubg = new chanel("Gaming Channel");
		Subscriber s22 = new Subscriber("Varun", pubg);
		Subscriber s23 = new Subscriber("Amit", pubg);
		Subscriber s24 = new Subscriber("Vatan", pubg);
		pubg.addSubscriber(s24);
		pubg.addSubscriber(s22);
		pubg.addSubscriber(s23);
		pubg.removeSubscriber(s24);
		pubg.UploadVideos("HeadShot videos");
	}
}