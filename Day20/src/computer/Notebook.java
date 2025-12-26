package computer;

import interfaceEx01.elec.Bluetooth;
import interfaceEx01.elec.Ctype;
import interfaceEx01.elec.Wifi;

public class Notebook implements Ctype, Bluetooth, Wifi{
	@Override
	public void connectWifi() {}
	@Override
	public void connectCtype() {}
	@Override
	public void connectBluetooth() {}
}
