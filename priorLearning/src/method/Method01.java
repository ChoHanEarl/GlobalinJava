package method;

public class Method01 {
	
	// 문제 1
	// 정수 둘을 인자로 전달받아서 두 수의 사칙연산 결과를 출력하는
	// 메소드와, 이 메소드를  호출하는 main 메소드를 정의해 보자.
	// 단, 나눗셈은 몫과 나머지를 각각 출력해야 한다.
	
	public static void calculator(int num1, int num2) {
		System.out.printf("%d + %d = %d\n", num1, num2, num1 + num2);
		System.out.printf("%d - %d = %d\n", num1, num2, num1 - num2);
		System.out.printf("%d * %d = %d\n", num1, num2, num1 * num2);
		System.out.printf("%d / %d = %d\n", num1, num2, num1 / num2);
		System.out.printf("%d %% %d = %d\n", num1, num2, num1 % num2);
		
	}
	
	public static void main(String[] args) {
		calculator(270, 40);
	}
}
