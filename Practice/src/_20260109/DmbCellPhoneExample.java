package _20260109;

public class DmbCellPhoneExample {
	public static void main(String[] args) {
		DmbCellPhone dmbCellPhone = new DmbCellPhone("자바폰","검정",10);
		
		System.out.println("모델: " + dmbCellPhone.model);
		System.out.println("색상: " + dmbCellPhone.color);
		System.out.println("채널: " + dmbCellPhone.channel);
		
		dmbCellPhone.powerOn();
		dmbCellPhone.bell();
		dmbCellPhone.sendVoice("여보세요.");
		dmbCellPhone.receiveVoice("안녕하세요! 저는 홍길동인데요.");
		dmbCellPhone.sendVoice("아~ 예 반갑습니다.");
		dmbCellPhone.hangUp();
		
		dmbCellPhone.turnOnDmb();
		dmbCellPhone.changeChannelDmb(12);
		dmbCellPhone.turnOffDmb();
		
		// 실행결과
		
		// 모델: 자바폰
		// 색상: 검정
		// 채널: 10
		// 전원을 켭니다.
		// 벨이 울립니다.
		// 자기: 여보세요.
		// 상대방: 안녕하세요! 저는 홍길동인데요.
		// 자기: 아~ 예 반갑습니다.
		// 전화를 끊습니다
		// 채널 10번 DMB 방송 수신을 시작합니다.
		// 채널 12번으로 바꿉니다.
		// DMB 방송 수신을 멈춥니다.
	}
}
