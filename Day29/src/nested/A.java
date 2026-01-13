package nested;

public class A {
	
	void a() {
		int a2 = 10;
		class A2 {
			void a2() {
//				a2 += 10;
				System.out.println(20);
			}
		}
		a2 = 10;
		System.out.println(a2);
		new A2().a2();
	}
	
	void a2() {
		I i = new I() {
			@Override
			public void i() {
				System.out.println(30);
			}
		};
		i.i();
	}
	
	
}
