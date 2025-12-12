package classPractice;

public class A {
	// 정보(속성, property, attribute, data)
	int a; // 전역 변수
	
	// 생성자(Constructor)
	// 법칙 : 생성자는 클래스명
	// 클래스를 사용하기 위해서는 new를 사용해야 한다.
	// new는 클래스 정보를 메모리에 올리는 것
	// 그 때 생성자가 불리는 것
	// 주로 초기화할 때 사용된다.
	// 생성자는 1회성이다. 클래스의 메타정보(초기정보)를 주입할 용도로 많이 쓰임
	// 생성자 또한 여러 개 존재할 수 있다.(오버로딩이 가능하다)
	// default 생성자는 우리가 만들지 않아도
	// 자바에서 알아서 만들어준다.
	// 그 말인 즉슨 default 생성자가 아닌 경우
	// (매개변수)가 존재하는 경우
	// 생성자를 선언할 때 반드시 값을 지정해주어야 한다.
	// 밑에 있는 A(int a) 생성자의 경우 main에서 호출할 때
	// A a = new A();로는 불가능, A a = new A(3);
	// 이런 식으로 해 주어야 한다.
	
	A(int a) {
		this.a = a;
		System.out.println(this.a);
	}
	
	A(int a, int a2){
		// 글자가 같을 경우 this를 사용
		// this는 자기 자신(by myself)
		this.a = a + a2;
		System.out.println(this.a);
	}
	
	// 처리
	void a(int a2) { // 메서드 시그니처(헤더)
		// 코딩
		//int a2 = 3; // 지역 변수
		a += a2; // => a = 13
		System.out.println(a);
	}
	
	void a(float a2) { // 메서드 시그니처(헤더)
		// 코딩
		// int a2 = 3; // 지역 변수
		a += a2; // => a = 13
		System.out.println(a);
	}
	
	void a(int a2, int a3) {
		a += a2; // => a = 13;
		a += a3; // => a = 17
	}
	
	// 메서드의 오버로딩
	// 메서드명이 같아도 
	// 매개변수의 개수가 다른 경우
	// 혹은 매개변수의 개수가 같으나 자료형이 다를 경우
	// 동일한 이름의 메소드를 만들 수 있다.
}

// 파일 하나에 클래스 여러개 존재는 가능
// 그러나 파일 하나에 클래스 하나를 보통 규칙으로 한다.
class A2 {
	
}
