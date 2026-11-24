package com.observer.design.pattern.subsriver;

//import java.nio.channels.Channel;
import java.util.ArrayList;
import java.util.List;

interface ISubscriber{
	void update();
}
interface IChannel{
	void addSubscriber(ISubscriber subscriber);
	void removeSubscriber(ISubscriber subscriber);
	void notifySubscriber();
}
class Channel implements IChannel{
	
	private String name;
	private List<ISubscriber> subscribers ;
	private String latestVideo;
	public Channel(String name) {
		this.name = name;
		this.subscribers = new ArrayList<ISubscriber>();
	}

	@Override
	public void addSubscriber(ISubscriber subscriber) {
		// TODO Auto-generated method stub
		if(!subscribers.contains(subscriber)) {
			subscribers.add(subscriber);
		}
		
	}

	@Override
	public void removeSubscriber(ISubscriber subscriber) {
		subscribers.remove(subscriber);
		
	}

	@Override
	public void notifySubscriber() {
		for(ISubscriber sub : subscribers) {
			sub.update();
		}
		
	}
	public void uploadVideos(String titles) {
		latestVideo = titles;
		System.out.println(name + "video uploader name " + titles + " and his titles");
		notifySubscriber();
	}
	public String getVideos() {
		 return "\nCheckout our new Video : " + latestVideo + "\n";
	}
}
class Subscriber implements ISubscriber{
	private String name;
	private Channel channel;
      public Subscriber(String name, Channel channel) {
    	  this.name = name;
    	  this.channel = channel;
      }
      
	@Override
	public void update() {
		// TODO Auto-generated method stub
		System.out.println(name + "name is here " + channel.getVideos());
	}	
}

public class Driver{
	public static void main(String args[]) {
		Channel channel = new Channel("CoderArmy");
		Subscriber sub1 = new Subscriber("Varun", channel);
		Subscriber sub23 = new Subscriber("Amit", channel);
		channel.addSubscriber(sub23);
		channel.addSubscriber(sub1);
		channel.removeSubscriber(sub23);
		channel.uploadVideos(null);
	}
}