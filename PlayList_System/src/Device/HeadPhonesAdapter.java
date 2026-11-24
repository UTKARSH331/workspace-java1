package Device;

import Models.Song;
import external.api.HeadphonesApi;
import external.api.IAudioOutputDevice;

public class HeadPhonesAdapter implements IAudioOutputDevice{

	private HeadphonesApi hapi;
	
	
	public HeadPhonesAdapter(HeadphonesApi hapi) {
		super();
		this.hapi = hapi;
	}


	@Override
	public void playaudio(Song song) {
		String payload = song.getTitle() + "by " + song.getArtist() +"filepath"+ song.getFilePath();
		hapi.playSoundViaJack(payload);
		
	}
	
}


