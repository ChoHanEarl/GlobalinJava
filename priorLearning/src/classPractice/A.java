package classPractice;

public class A {

	int a;
	
	A(int a) {
		this.a = a;
	}
	
	int a1(int a) {
		this.a++;
		return a2(a);
	}
	
	int a2(int a) {
		this.a++;
		return a3(a);
	}
	
	int a3(int a) {
		return this.a + a;
	}
	
}
