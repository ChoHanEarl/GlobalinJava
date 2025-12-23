package inheritance;

public class A2 extends A {
	
	int a;
	void a() {
		System.out.println("A2");
//		super.a();
	}
	
	void a2() {
		// 부모의 인자를 가리키는 super
		super.a = 10;
	}
	
}
