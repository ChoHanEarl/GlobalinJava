package encapsulation;

public class Encapsulation {

	// 캡슐화
	// 객체지향 프로그래밍의 핵심 원칙 중 하나
	// 외부에서 직접 접근하지 못하도록 숨기는 것
	
	// 캡슐화 목적
	// 데이터 보호 : 외부에서 객체의 내부 데이터를 함부로 변경하지 못하게 한다
	// 정보 은닉 : 구현 세부사항을 숨기고 필요한 부분만 공개한다
	// 유지보수성 향상 : 내부 구현을 변경해도 외부 코드에 영향을 최소화한다
	
	// 접근 제어자(access modifier)
	// 1. private : 같은 클래스 내에서만 접근 가능
	// 2. default : 같은 패키지 내에서만 접근 가능
	// 3. protected : 같은 패키지 또는 상속받은 클래스에서 접근 가능
	// 4. public : 모든 곳에서 접근 가능
	
	private int a;
	private static int A2;
	private Encapsulation() {}
	private void a() {}
	private static void A() {}
	
}
