package factories;

import Device.BluetoothSpeakerAdapter;
//import Device.BluetoothSpeakerApi;
import Device.HeadPhonesAdapter;
//import Device.HeadphonesApi;
//import Device.IAudioOutputDevice;
import Device.WiredSpeakerAdapter;
//import Device.WiredSpeakerApi;
import enum1.DeviceType1;
import external.api.BluetoothSpeakerApi;
import external.api.HeadphonesApi;
import external.api.IAudioOutputDevice;
import external.api.WiredSpeakerApi;

public class Devicefactory {
	
	public static IAudioOutputDevice createdevicefactory(DeviceType1 dt){
		switch(dt) {
		case BLUETOOTH :
			return new BluetoothSpeakerAdapter(new BluetoothSpeakerApi());
		case WIRED :
			return new WiredSpeakerAdapter (new WiredSpeakerApi());
		case HEADPHONES:
			default :
			return new  HeadPhonesAdapter(new HeadphonesApi());
		}
	}

}
