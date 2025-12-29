package advanced.ext;

public class CTester {
	public static void main(String[] args) {
		C c = new C();
		c.c();
		c.d();
		
		// 다형성
		D d = new C();
		d.d();
		
	}
}
