package com.observer.practice1.design.pattern;

import java.util.ArrayList;
import java.util.List;

interface IChannel{
	void addSubsrciber(ISubscriber subscriber);
	void removeSubscriber(ISubscriber subscriber);
	void notifySubscriber();
}
interface ISubscriber{
	void update();
}

class Channel implements IChannel{
	private String name;
	private String latestVideo;
	private List<ISubscriber> s1;
	
	@Override
	public void addSubsrciber(ISubscriber subscriber) {
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
		for(ISubscriber sub : s1 ) {
			sub.update();
		}
	}
	
	public void uploadVideos(String types) {
		latestVideo = types;
		System.out.println( name +"name "+"video is uploaded " + types);
		notifySubscriber();
		
	}
	public Channel(String name) {
		super();
		this.name = name;
		this.s1 = new ArrayList<ISubscriber>();
	}
	public String getVideos() {
		return " \n chek new videos " + latestVideo + "\n";
	}
	
}
class Subscriber implements ISubscriber{
private String name;
private Channel c1;


	public Subscriber(String name, Channel c1) {
	super();
	this.name = name;
	this.c1 = c1;
}


	@Override
	public void update() {
		System.out.println(name + "name is here " + c1.getVideos());
		
	}
	
}

public class Driver2 {
	public static void main(String[] args) {
		Channel gameCreator = new Channel("Pubg");
		Subscriber s22 = new Subscriber("Arun", gameCreator);
		Subscriber s33 = new Subscriber("Atul", gameCreator);
		gameCreator.addSubsrciber(s33);
		gameCreator.addSubsrciber(s22);
		gameCreator.notifySubscriber();
		gameCreator.uploadVideos("new Videos");
	}

}
