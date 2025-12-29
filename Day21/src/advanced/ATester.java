package advanced;

public class ATester {
	public static void main(String[] args) {
		A a1 = new A(10);
		A a2 = new A(20);
		System.out.println(a1.a);
		System.out.println(a2.a);
		int a3 = a1.a - a2.a;
		System.out.println(a3);
		A.A = 10;
		A.a2();
	}
}
