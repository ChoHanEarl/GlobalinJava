package practice02;

public class Calculator {
	public static void main(String[] args) {
		// 계산기 만들기
		// 두 개의 정수형 변수를 초기화한다.
		// 그리고 연산자를 담아줄 문자열 변수를 만든다.
		// switch문을 이용하여 정수의 연산을 수행하는 코드를 작성해보자

		int a = 20;
		int b = 10;
		String op = "/";
		
		switch(op) {
		case "+" :
			System.out.printf("%d + %d = %d\n", a, b, a+b);
			break;
		case "-" :
			System.out.printf("%d - %d = %d\n", a, b, a-b);
			break;
		case "*":
			System.out.printf("%d * %d = %d\n", a, b, a*b);
			break;
		case "/":
			System.out.printf("%d / %d = %d\n", a, b, a/b);
			break;
		default:
			System.out.println("올바른 연산자가 아닙니다.");
			break;
		}
	}
	
	
}
