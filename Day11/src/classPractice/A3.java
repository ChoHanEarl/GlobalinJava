package classPractice;

public class A3 {
	
	// 정보
	int a;
	
	// new - 생성자 오버로딩
	// 생성자명이 같고 매개변수의 개수가 다르거나
	// 매개변수의 타입이 다른 경우
	A3() {
//		this.a = 10;
		System.out.println(a);
	}
	
	A3(int a) {
		this.a = a;
		System.out.println(this.a);
	}
	
	A3(float a) {
//		this.a = 13;
		System.out.println(a);
//		System.out.println(this.a);
	}
	
	A3(int a, int a2) {
		this.a = a + a2;
		System.out.println(this.a);
	}
	
	// 처리 - 메소드 오버로딩
	// 메소드명이 같아도 매개변수의 개수나 타입이 다를 경우
	// 생성이 가능하다.
	void a(int a2) {
		a += a2;
		System.out.println(a);
	}
	
	void a(float a2) {
		a += a2;
		System.out.println(a);
	}
	
	void a(int a2, int a3) {
		a += a2;
		a += a3;
		System.out.println(a);
	}
	
	
}
