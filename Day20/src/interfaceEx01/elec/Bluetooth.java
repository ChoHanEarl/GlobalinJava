package interfaceEx01.elec;

public interface Bluetooth {
	// interface에 들어있는 변수는 상수, 즉 static final이다.
	// 즉 interface의 목적은 표준을 정의하는 것이다.
	// 여기서는 Bluetooth의 버전은 5라는 것,
	// 이를 재정의하기 위해서는 new를 하는 것이 아닌 본인이 직접
	// 정의해야 한다.(static)
	// 다형성 하면 상속 계열 / 인터페이스 계열 이렇게 두 가지로 나뉜다.
	// 상수
	int version = 5;
	// 추상 메서드
	void connectBluetooth();
	// default 메서드
	default void b() {}
	// static 메서드
	static void b2() {}
	
}
