package classPractice;

public class Tester {
	public static void main(String[] args) {
		String s = "hello";
		String s2 = new String("hello");
		
		A a = new A(10);
		A a2 = new A(10, 20);
		
//		a.a = 10;
		System.out.println(a.a);
		a.a(4);
		a.a(4.01f);
		a.a(4, 3);
		
	}
}
