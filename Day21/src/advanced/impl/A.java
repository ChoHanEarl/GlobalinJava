package advanced.impl;

public interface A {
	// 클래스 변수
	int a = 10; // interface는 추상(abstract)이기 때문에, 역시 선언과 동시에 초기화가 되어야 한다.
	
	// 추상 메소드
	void a(); // interface의 메소드는 body를 가질 수 없다.
	
	// default 메소드(구현 의무가 없다.)
	default void a2() {}; // body를 가지기 위해서는 default를 붙여주어야 한다.
	
	// 클래스 메소드
	static void a3() {};  // 혹은 static일 경우에도 가능하다.	
}
