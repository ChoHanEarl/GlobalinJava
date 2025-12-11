package method;

public class Method05 {
	// 재귀함수(재귀 메소드) 정의해보기
	// 팩토리얼( ! ) 을 표현해보기
	// 5가 들어가면 120이 출력되게끔
	
	public static void main(String[] args) {
		System.out.println(factorial(3));
	}
	
	public static int factorial(int n) {
		if(n == 1) {
			return 1;
		} else {
			return n * factorial(n-1);
		}
	}
}
