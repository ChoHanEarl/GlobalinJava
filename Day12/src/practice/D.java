package practice;

public class D {
	
	// instance 변수
	int d;
	
	// 생성자 (Constructor)
	D() {
		this.d = 5;
	}
	
	D(int d) {
		this.d = d;
	}
	
	D(float d){
		this.d = (int) d;
	}
	
	D(int d, int e){
		this.d = d + e;
	}
	
	// method
	void d() {
		
	}
	
	void d(int d) {
		this.d = d;
	}
	
	void d(float d) {
		this.d = (int) d;
	}
	
	void d(int d, int e) {
		this.d = d - e;
		System.out.println(this.d);
	}
	
	
}
