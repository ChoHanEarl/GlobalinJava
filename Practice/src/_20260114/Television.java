package _20260114;

public class Television extends RemoteControll {

	int volume = 0;
	
	@Override
	void turnOn() {
		System.out.println("TV를 켭니다.");
	}
	
	@Override
	void turnOff() {
		System.out.println("TV를 끕니다.");
	}
	
	@Override
	void setVolume(int vol) {
		if(vol < 0 || vol > 100) {
			System.out.println("0~100사이로 설정하세요");
		} else {
			this.volume = vol;
			System.out.printf("현재 TV 볼륨: %d\n", this.volume);			
		}
	}
}
