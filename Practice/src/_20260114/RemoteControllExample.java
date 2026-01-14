package _20260114;

public class RemoteControllExample {

	public static void main(String[] args) {
		RemoteControll rc;
		Television t = new Television();
		Audio a = new Audio();
		
		t.turnOn();
		t.setVolume(-1);
		t.setVolume(101);
		t.setVolume(7);
		t.turnOff();
		System.out.println();
		a.turnOn();
		a.setVolume(-1);
		a.setVolume(101);
		a.setVolume(7);
		a.turnOff();
		
	}
	
	// 출력결과
	// TV를 켭니다.
	// 현재 TV 볼륨: 0
	// 현재 TV 볼륨: 10
	// 현재 TV 볼륨: 7
	// TV를 끕니다.
	
	// 오디오를 켭니다.
	// 현재 오디오 볼륨: 10
	// 현재 오디오 볼륨: 0
	// 현재 오디오 볼륨: 7
	// 오디오를 끕니다.
}
