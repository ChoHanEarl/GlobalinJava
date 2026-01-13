package builder;

public class ATester {
	public static void main(String[] args) {
		A a = new A.Builder().a(10).a2(20).build();
		System.out.println(a.a);
		System.out.println(a.a2);
	}
}
