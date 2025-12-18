package staticPractice;

public class F {

	// static은 정적
	// static은 고정적인 정보, 공유되는 정보, instance는 개별적인 정보
	// static이 붙으면 클래스들이 공유하여 처리
	// 이 처리는 반드시 계속 자주 쓰이는 처리이기 때문에
	// static을 붙인다.
	// static을 붙이면 new(동적)를 사용할 필요가 없이
	// 바로 선언이 가능하다. ex) F.f = 10; F.f();
	
	// 인스턴스 변수(오로지 F 클래스의 것)
	int f;
	
	// 클래스 변수(보통 올 대문자, 언더바 사용)
	// 다른 클래스에서 new를 사용하지 않아도 활용 가능
	static int F;
	
	// 클래스 초기화 블록
	static {
		
	}
	
	// 생성자
	// static 불가능
	F() {
		
	}
	
	// 클래스 메소드
	static void f() {
//		this.F++; 불가능
		F++;
//		f++; Cannot make a static reference to the non-static field f
		// static은 메모리에 상주하기 때문에 이미 있는 상태.
		// 그러나 인스턴스는 new가 선언되어야만 올라오는 존재.
		// 즉 아직 메모리에 올라오는지 확정이 안 된 상태에서
		// static에 올 수 없다는 의미.
		
//		f.f++;
	}
	
	// 인스턴스 메소드
	// 인스턴스 메소드 안에서는 static과 instance 모두
	// 활용 가능하다.
	void f1() {
		F++;
		f++;
	}
	
}
