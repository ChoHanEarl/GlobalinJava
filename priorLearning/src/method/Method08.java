package method;

public class Method08 {

	// 문제
	// 인자로 10진수 정수를 전달받아서 이에 해당하는 이진수 표현을 출력하는 메소드
	// 재귀의 형태로 정의하고, 이를 호출하는 main 메소드를 정의해보자.

	public static void main(String[] args) {
		int decimalNumber = 5;
		System.out.print("10진수 " + decimalNumber + "의 2진수 변환 결과: ");
		decimalToBinary(decimalNumber);
		System.out.println(); 

		decimalNumber = 13;
		System.out.print("10진수 " + decimalNumber + "의 2진수 변환 결과: ");
		decimalToBinary(decimalNumber);
		System.out.println();
	}

	public static void decimalToBinary(int n) {
		
		if (n == 0) {
			return;
		}

		decimalToBinary(n / 2);

		System.out.print(n % 2);
	}
}
