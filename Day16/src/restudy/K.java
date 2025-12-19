package restudy;

public class K {
	
//	int k1 = new J().j; // 인스턴스 호출
//	int k2 = J.J; // static 호출
	J j = J.j2();
	//	J.j2(); J.j2는 값이 아니라 코드이기 때문에 메소드나 생성자
	// 안에서만 호출 가능
	
	K(){
//		J j = new J();
		J j = J.j2();
		j.j(10);
	}
	
	void k() {
//		J j = new J();
		J.j2();
	}
	
}
