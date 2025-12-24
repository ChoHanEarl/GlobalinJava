package abstractEx;

// 추상 클래스
// new를 할 수 없는 클래스
// 상속을 받아야만 하는 클래스
public abstract class Animal {
	String name;
	protected abstract String getName();
	void getName1() {}
	String getName2() {
		return null;
	}
	
	// 추상 메소드의 조건
	// 1. 추상 클래스여야 한다
	// 2. 바디(중괄호)가 없어야 한다 (메소드 선언문/시그니처만 있는 메소드)
	
	
}
