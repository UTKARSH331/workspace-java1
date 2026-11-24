package manager;

import java.util.HashMap;
import java.util.Map;
import Models.*;
import Models.PlayList;

public class PLaylistManager {

	private static PLaylistManager instance = null;
	private Map<String , PlayList> playlists;
	
	private PLaylistManager() {
		this.playlists = new HashMap<>();
	}
	public static synchronized PLaylistManager getInstance() {
		if(instance == null) {
			instance = new PLaylistManager();
		}
		return instance;
	}
	public void createPlaylist(String name) {
		if(playlists.containsKey(name)) {
			throw new RuntimeException("Playlist \"" + name + "\" already exists.");
		}
		playlists.put(name, new PlayList(name));
	}
	public void addSongToPlaylist(String playlistname, Song song ) {
		if(!playlistname.contains(playlistname)) {
			throw new RuntimeException("Playlist \"" + playlistname + "\" not found.");
		}
		playlists.get(playlistname).addSongToPlaylist(song);
	}
	public PlayList getPlayLists(String name) {
		if(!playlists.containsKey(name)) {
			throw new RuntimeException("Playlist \"" + name + "\" not found.");
		}
		return playlists.get(name);
	}
	
}
