package classPractice;

public class B {
	
	int b;
	
	// { } 초기화 블록
	// 중괄호만 쓰는 경우는 거의 없지만
	// 사용되는 경우 생성자보다 먼저 실행된다.
	// 컴파일러가 내부적으로 초기화 블록의 코드를 모든 생성자의 맨 앞에
	// 복사하기 때문이다. (주로 임베디드용으로 쓰임)
	
	{
		System.out.println("1");
	}
	
	// 기본 생성자
	// 생략 가능
	B() {
//		this.b = 10; 불가능(메모리에 올라가지 않은 상태이기 때문)
		this(10);
		System.out.println("2");
		this.b = 10; // 가능
	}
	{
		System.out.println("1");
	}
	// 생성자 오버로딩
	// 매개변수가 포함된 생성자를 선언하는 순간 
	// 그냥 new B();는 사용할 수 없게 된다.
	// 기본 생성자를 직접 선언하거나
	// 값을 주어야 사용 가능
	B(int b) {
		this.b = b;
	}
	
	// 메서드 오버로딩
	void b() {
//		this(10); 메소드 내에서는 생성자를 호출할 수 없다.
		this.b(30);
	}
	
	void b(int b) {
		this.b = b;
	}
	
	
	
}
