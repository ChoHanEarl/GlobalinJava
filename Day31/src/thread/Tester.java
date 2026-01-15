package thread;

public class Tester {
	public static void main(String[] args) {
//		A a = new A(); // Thread 상속받은 A 클래스
//		System.out.println(a); // 참조변수 주소 자체가 Thread로 뜬다
//		a.start(); // => start()를 해야 Thread가 실행(동시에 동작)
//		B b = new B(); 
//		System.out.println(b);
//		b.start(); // => start()를 해야 Thread가 실행(동시에 동작)
		
//		C c = new C();
//		c.run();
		
		
//		// 그냥 해본거
//		StringBuilder sb = new StringBuilder("");
//		sb.append("a");
//		sb.append("b");
//		System.out.println(sb.toString());
		
//		new Thread(new D()).start();
//		new Thread(() -> 
//			System.out.println(11)
//			).start();
		
		try {
			new E().e();
		} catch(Exception e) {
			e.printStackTrace();
		}
		
	}
}
