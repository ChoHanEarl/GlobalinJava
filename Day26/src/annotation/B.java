package annotation;

public class B extends A {
	
	// Override는 부모와 메소드 시그니처가 동일해야 함
	// @Override를 붙이면 메소드 시그니처가 달라질 경우
	// 에러를 표시해줌.
	// @Override를 붙이지 않은 채 메소드 시그니처가 바뀔 경우
	// 에러가 아닌 자식 클래스 고유의 메소드가 됨
	@Override
	@Hello(message = "Hi")
	void a(String msg) {
		System.out.printf("invoked %s", msg);
	}
	
	// 이러면 에러가 뜸
//	@Override
//	void a2() {
//		
//	}
	
	// @Deprecated
	// 이 메소드는 권장하지 않는다
	@Deprecated
	void b() {
		
	}
	
}
