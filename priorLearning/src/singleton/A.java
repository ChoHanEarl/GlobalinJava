package singleton;

public class A {

	// static 변수 b 선언
	private static A instance;
	
	// 외부 생성을 막기 위한 private 생성자
	private A() { 
		System.out.println("객체 생성!");
	}
	
	// instance를 받는 메소드 선언
	public static A getInstance() {
		if(instance == null) {
			instance = new A();
		}
		return instance;
	}
	
}
