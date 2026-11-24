package strategy;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

import Models.PlayList;
import Models.Song;

public class CustomQueueStrategy implements PlayStrategy  {

	private PlayList currentPlaylists;
	private int currentIndex;
	private Queue<Song> nextQueue;
	private Stack<Song> prevStack;
	@Override
	
	public void setPlaylists(PlayList plts) {
		currentPlaylists = plts;
		currentIndex = -1;
		nextQueue.clear();
		prevStack.clear();		
	}

	public CustomQueueStrategy() {
		super();
		this.currentPlaylists = null;
		this.currentIndex = -1;
		this.nextQueue = new LinkedList<>();
		this.prevStack = new Stack<>();
	}

	@Override
	public Song next() {
		if(currentPlaylists  == null || currentPlaylists.getSize() == 0) {
			throw new RuntimeException("No playlist loaded or playlist is empty.");
		}
		if(!nextQueue.isEmpty()) {
			Song s = nextQueue.poll();
			prevStack.push(s);
		}
		//update index to match queued song
		
		for(int i = 0; i< currentPlaylists.getSongList().ge )
	}

	@Override
	public boolean hasNext() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Song previous() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean hasPrevious() {
		// TODO Auto-generated method stub
		return false;
	}

}
