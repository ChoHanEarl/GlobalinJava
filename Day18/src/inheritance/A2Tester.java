package inheritance;

public class A2Tester {
	public static void main(String[] args) {
		
		// 오버라이딩
		// 부모 기능의 재정의
		// A a = a2를 선언했음에도 불구하고 a.a()를 했더니
		// 자식 클래스의 메소드가 호출되었다.
		// 상속에서 부모의 메소드를 자식에서 재정의.
		// 자식 메소드가 우선권을 가진다.
		
		A2 a2 = new A2();
//		a2.a2();
		A a = a2;
		a.a();
//		System.out.println(a.a); // 10
//		System.out.println(a2.a); // 0
		
		
	}
}
