package _20260109;

public class DmbCellPhone {

	String model;
	String color;
	int channel;
	
	public DmbCellPhone(String model, String color, int channel) {
		this.model = model;
		this.color = color;
		this.channel = channel;
	}
	
	void powerOn() {
		System.out.println("전원을 켭니다.");
	}
	
	void bell() {
		System.out.println("벨이 울립니다.");
	}
	
	void sendVoice(String hello) {
		System.out.println("자기: " + hello);
	}
	
	void receiveVoice(String introduce) {
		System.out.println("상대방: " + introduce);
	}
	
	void hangUp() {
		System.out.println("전화를 끊습니다");
	}
	
	void turnOnDmb() {
		System.out.printf("채널 %d번 DMB 방송 수신을 시작합니다.\n", this.channel);
	}
	
	void changeChannelDmb(int channel) {
		this.channel = channel;
		System.out.printf("채널 %d번으로 바꿉니다.\n", this.channel);
	}
	
	void turnOffDmb() {
		System.out.println("DMB 방송 수신을 멈춥니다.");
	}
	
}
