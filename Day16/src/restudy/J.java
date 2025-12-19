package restudy;

public class J {

	// 인스턴스 변수
	int j;
	
	// 클래스 변수
	private static J STATIC_REF = new J();
	
	// 인스턴스 초기화 블록
	{
		
	}
	
	// static 초기화 블록
	static {
		
	}
	
	// 생성자
	private J(){
		
	}
	
	// 생성자 오버로딩
	private J(int a){
		
	}
	
	private J(float a){
		
	}
	
	// 메소드
	void j(int a){
		
	}
	
	// 메소드 오버로딩
	void j(int a, int b) {
		
	}
	
	void j(float a) {
		
	}
	
	// 정적 메소드
	static J j2() {
		return STATIC_REF;
	}
	
}
