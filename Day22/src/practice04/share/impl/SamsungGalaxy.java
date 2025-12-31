package practice04.share.impl;

import practice04.share.Bluetooth;
import practice04.share.SamsungElec;

public class SamsungGalaxy {

	void share(Bluetooth bluetooth) {
		if( bluetooth instanceof SamsungElec ) {
			bluetooth.connect();
		}
	}
	
}
