package object;

public class A {
	// extends Object는 기본. 그러나 생략(너무 당연한 것이기 때문)
	void a() {a2();}
	void a2() {}
	
	@Override
	public int hashCode() {
		return 10;
	}
	
	@Override
	public boolean equals(Object obj) {
		return this.hashCode() == obj.hashCode();
	}
	
}
