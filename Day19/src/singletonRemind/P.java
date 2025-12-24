package singletonRemind;

public class P {

	// private이기 때문에 new를 못하니
	// static이 붙지 않으면
	// 밖에서는 아무도 p를 사용할 수 없다.
	// 설령 메소드에서 p를 받더라도 말이다.
	// static이 붙게 되면 프로그램이 실행될 때
	// 곧바로 메모리에 올라가기 때문에
	// 활용이 가능하다.
	
	// private static class를 활용해 한번 더 감싸준다
	// 멀티스레드 환경일 경우 동시 접속할 때 위험할 수 있기 때문
	private static class P_INNER {
		private static P INSTANCE = new P();		
	}
	
	
	private P() {
		
	}
	
	// synchronized를 통해
	// 한 번에 하나만 처리 가능하도록 설정
	// 즉 한 번에 여러 곳에서 활용 불가능
	public static synchronized P getInstance() {
		return P_INNER.INSTANCE;
	}
	
}
