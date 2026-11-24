package Models;

import java.util.ArrayList;
import java.util.List;

public class PlayList {
private String playlistname;
private List<Song> songList;
public PlayList(String name) {
	super();
	this.playlistname = name;
	this.songList =  new ArrayList<>();
}
public String getPlaylistname() {
	return playlistname;
}

public List<Song> getSongList() {
	return songList;
}

public int getSize() {
	return songList.size();
}

public void addSongToPlaylist(Song song) {
	if(song == null) {
		throw new RuntimeException("cannot add null song to playlist. ");
	}
	songList.add(song);
}

}
