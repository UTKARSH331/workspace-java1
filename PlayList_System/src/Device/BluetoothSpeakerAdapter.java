package Device;

import Models.Song;
import external.api.BluetoothSpeakerApi;
import external.api.IAudioOutputDevice;

public class BluetoothSpeakerAdapter implements IAudioOutputDevice{
    private BluetoothSpeakerApi bapi;
    
	public BluetoothSpeakerAdapter(BluetoothSpeakerApi bapi) {
		super();
		this.bapi = bapi;
	}

	@Override
	public void playaudio(Song song) {
		String payload = song.getTitle() + "by " + song.getArtist();
		bapi.playSoundViaJack(payload);
		
	}
	
}