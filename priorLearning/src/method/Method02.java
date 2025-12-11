package method;

public class Method02 {
	// 문제 2
	// 정수 둘을 인자로 전달받아서, 두 수의 '차의 절대값'을 계산하여
	// 출력하는 메소드와 이 메소드를 호출하는 main 메소드를 만들기
	// 단, 메소드 호출 시 전달되는 값의 순서에 상관없이
	// 절대값이 계산되고 출력되어야 한다.
	
	public static void minus(int num1, int num2) {
		int num3 = num1 - num2;
		if(num3 < 0) {
			num3 *= -1;
		}
		System.out.println("두 수의 차의 절대값");
		System.out.printf("%d - %d = %d\n", num1, num2, num3);
	}
	
	public static void main(String[] args) {
		minus(3,10);
	}
}
