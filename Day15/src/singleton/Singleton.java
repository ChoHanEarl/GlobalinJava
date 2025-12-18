package singleton;

public class Singleton {
	// 실습
	// 1. 주어진 객체를 싱글턴 패턴으로 구현하시오.
	// - new 사용 금지 : 생성자를 private으로, static 사용
	
//	이렇게 바로 선언하는 것은 위험하다.
//	실제 서버에서는 수많은 사람들이 접속하므로
//	자칫하다가 서버가 터지는 상황이 발생할 수 있다.
//  이마저도 털릴 가능성 있음
//	따라서 최종적인 방식은 아래 메소드의 형태이다.
//	private static Singleton s = new Singleton();
	static class Singleton_Inner {
		private static Singleton s = new Singleton();		
	}
	
	// private은 해당 클래스 내부에서만 보이는 것
	// 외부에서 활용 불가능.
	private Singleton() {
		
	}
	
	public static synchronized Singleton getInstance() {
//		if( s == null ) {
//			s = new Singleton();
//		}
//		s = new Singleton();
		return Singleton_Inner.s;
	}
	// 상대방이 생성자를 활용 불가능(private으로 선언)
	// 즉 본인만 활용 가능
	// 따라서 본인을 static으로 선언하여 메모리에 상주시켜 놓고
	// 이를 new로 받아놓으면 다른 클래스에서 활용 가능하다.
}
