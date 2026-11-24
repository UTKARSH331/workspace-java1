package strategy;

import Models.PlayList;
import Models.Song;

//import java.awt.DefaultFocusTraversalPolicy;

public interface PlayStrategy {
	void setPlaylists(PlayList plts);
	Song next();
	boolean hasNext();
	Song previous();
	boolean hasPrevious();
	default void addToNext(Song song) {
		
	}

}
