package singleton;

public class Main {
	public static void main(String[] args) {
		
		A a1 = A.getInstance();
		A a2 = A.getInstance();
		A a3 = A.getInstance();
		
		System.out.println(a1.hashCode());
		System.out.println(a2.hashCode());
		System.out.println(a3.hashCode());
		
		System.out.println(a1 == a2);
		System.out.println(a1 == a3);
		System.out.println(a3 == a2);
		
	}
}
