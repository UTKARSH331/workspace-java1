package Device;

import Models.Song;
import external.api.IAudioOutputDevice;
import external.api.WiredSpeakerApi;


	
  public	class WiredSpeakerAdapter implements IAudioOutputDevice{
	     private WiredSpeakerApi wapi;
	     
		public WiredSpeakerAdapter(WiredSpeakerApi wapi) {
			super();
			this.wapi = wapi;
		}

		@Override
		public void playaudio(Song song) {
			String payload = song.getTitle() + "by " + song.getArtist();
			wapi.playSoundViaJack(payload);
		}
		
	}
	



