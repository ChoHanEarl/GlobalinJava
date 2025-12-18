package staticPractice;

public class FTester {
	
	void f1() {
		
	}
	
	void f() {
		f1();
	}
	
	public static void main(String[] args) {
		
		// 클래스 변수의 초기값 0
		// 클래스 변수에 10을 주고
		// 그 후 인스턴스 변수를 선언
		// 그 후에도 클래스 변수의 값은 그대로다.
		// 결국 인스턴스 변수의 여부와 관계 없이
		// 고정적이라는 사실을 알 수 있다.
		
		// 인스턴스는 여러 개를 만들 수 있다.
		// 다만 static은 하나만 존재할 수 있다.
		
//		f(); main은 static임. 따라서 instance인 f()는 
//		에러가 뜸
		
		System.out.println(F.F);
		F.F = 10;
		F[] fArr = new F[3];
		fArr[0] = new F();
//		fArr[0].f(); 
// 		static인데 instance를 통해 호출하여 경고 표시가 뜸
// 		문법적 오류는 아님.
		F.f();
		fArr[1] = new F();
//		fArr[1].f();
		F.f();
		fArr[2] = new F();
//		fArr[2].f();
		F.f();
		System.out.println(F.F);
		System.out.println();
	}
}
