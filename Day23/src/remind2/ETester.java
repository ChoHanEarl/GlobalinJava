package remind2;

public class ETester {
	public static void main(String[] args) {
		E e = new E();
		System.out.println(e.c);
		C c = new E();
		System.out.println(c.c);
		E e2 = (E)c;
		System.out.println(e2.c);
		D d = (D)c;
		System.out.println(d.c);
		// ClassCastException
//		c = new D();
//		e = (E)c;
//		System.out.println(e.c);
	}
}
