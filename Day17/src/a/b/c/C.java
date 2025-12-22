package a.b.c;

// 자바 빈 클래스(Java Bean Class)
// 정보 위주의 클래스(처리보다는 저장)
public class C {
//	public int c;
//	public static int C;
	
	// 정보(instance)는 반드시 private으로 받는다
	private int c;
	
	public C() {
		
	}
	
	public int getC() {
		return this.c;
	}
	
	public void setC(int c) {
		this.c = c;
	}
	
}
