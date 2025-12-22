package classPractice;

public class L {
	
	// 인스턴스 변수, 디폴트 생성자, 인스턴스 메소드
	// new 키워드를 통해 접근
	
	// static은 정적
	// 그냥 바로 접근
	
	// 인스턴스 변수
	int l;
	
	private static L l2 = new L();
	
	// 클래스 변수
	static int L;
	
	// 생성자(private을 통해 인스턴스를 하나만 존재하게끔 하기)
	private L(){}
	
	// 인스턴스 메소드
	static L l() {
		return l2;
	}
	
	// 클래스 메소드
//	static void l2(L l) {
//		// non-static
//		// static에서 instance를 그냥 호출하면 non-static이 뜸
//		// l(); => non-static
//		// 따라서 L l을 매개변수로 받고 선언해야 한다.
//		l.l();
//	}
	
}
