package proxy;

public class B_Proxy extends A {
	B b;
	void a() {
	    // 코드 추가 : 전처리
		b.a();
		// 코드 추가 : 후처리
	}
}
