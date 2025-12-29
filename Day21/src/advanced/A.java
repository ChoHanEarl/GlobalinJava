package advanced;

/*
 * 고급
 * Class, constructor, this, method, new, Instance, Overloading, static
 */
public class A {

	// 인스턴스 변수
	int a;
	
	// 클래스 변수
	static int A;
	
	// 인스턴스 초기화 블럭
	{}
	
	// 클래스 초기화 블럭
	static {}
	
	// 기본 생성자
	A(){}
	
	// 생성자 오버로딩
	A(int a){
		this.a = a;
	}
		
	// 인스턴스 메소드
	void a() {}
	
	// 메소드 오버로딩
	void a(int a) {}
	
	// 클래스 메소드
	static void a2() {}
	static void a2(int a) {}

}
