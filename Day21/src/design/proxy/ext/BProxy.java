package design.proxy.ext;

public class BProxy extends A { 
	// 원본 클래스인 B의 가짜 클래스(메모리상)
	
	B b;
	
	// 오버라이딩
	void a() {
		// 전처리
		b.a(); // 원본 메소드
		
		// 후처리
	}
	
}
