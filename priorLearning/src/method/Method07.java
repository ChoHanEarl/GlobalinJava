package method;

public class Method07 {
	// 문제
	// 인자로 정수 n을 전달받아서 2의 n승을 계산하여 반환하는 메소드를
	// 재귀의 형태로 정의하고, 이를 호출하는 main 메소드를 정의해보자.
	
	public static void main(String[] args) {
		System.out.println(flex(4));
	}
	
	public static int flex(int n) {
		
		if(n == 0) {
			return 1;
		} else return 2 * flex(n-1);
		
		
		
		
	}
}
