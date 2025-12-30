package practice04;

import java.util.Scanner;

public class Calculator {
	// 계산기 만들기
	// 클래스로 계산기 만들어보기 문제
	// 첫 번째 숫자 입력 : 5
	// 두 번째 숫자 입력 : 10
	// 연산기호 입력 : +
	// 결과 : 15
	// Scanner를 사용해 숫자 두 개와 연산기호를 받은 뒤
	// 계산해주는 클래스를 만들고 실행하기
	// String의 비교는 ==이 아닌 String변수.equals("비교값")으로 한다.
	
	public int getResult(int n1, int n2, String str) {
		if(str.equals("+")) {
			return n1 + n2;
		} else if(str.equals("-")) {
			return n1 - n2;
		} else if(str.equals("*")) {
			return n1 * n2;
		} else if(str.equals("/")) {
			return n1 / n2;
		} else {
			System.out.println("연산기호가 올바르지 않습니다.");
		}
		return -1;
	}
	
	
}
