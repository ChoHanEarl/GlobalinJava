package practice04;

import java.util.Scanner;

public class MethodTestMain {
	public static void main(String[] args) {
		MethodTest mTest = new MethodTest();
		mTest.circleArea(5);
		mTest.circleRound(5);
		mTest.arithmetic(3, 5);
		
		System.out.print("1을 누르면 섭씨, 2를 누르면 화씨로 변경");
		Scanner sc = new Scanner(System.in);
		int select = sc.nextInt();
		
		switch(select) {
		case 1:
			mTest.fahrenheitToCelcius();
			break;
		case 2:
			mTest.celsiusToFahrenheit();
			break;
		}
		
	}
}
