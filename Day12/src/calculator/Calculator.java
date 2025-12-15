package calculator;

public class Calculator {
	
	// 두 정수를 받아서 그 합을 반환해 주는 메소드
	
	int add(int num1, int num2) {
		int sum = num1 + num2;
		return sum;
	}
	
	int min(int num1, int num2) {
		int min = num1 - num2;
		if(num1 < num2) min = num2 - num1;
		return min;
	}
	
	int multi(int num1, int num2) {
		int multi = num1 * num2;
		return multi;
	}
	
	int div(int num1, int num2) {
		int div = num1 / num2;
		return div;
	}
	
}
