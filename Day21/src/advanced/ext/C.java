package advanced.ext;

/*
 * Inheritance, extends, super, final, Overriding, abstract, interface, implements
 */
public class C extends D {
	int d;
	void c() {
		this.d = 10; // C클래스의 인스턴스
		super.d = 20; // D클래스(부모)의 인스턴스
		super.d();
	}
	// 오버라이딩
	void d() {
		this.d = 10;
		super.d = 20;
		System.out.println(d);
	}
	
	@Override
	void e() {
		// TODO Auto-generated method stub
	}
	
}
