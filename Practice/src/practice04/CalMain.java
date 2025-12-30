package practice04;

import java.util.Scanner;

public class CalMain {
	public static void main(String[] args) {
		Calculator cal = new Calculator();
		int n1, n2;
		String str;
		Scanner sc = new Scanner(System.in);
		System.out.print("첫 번째 숫자 입력 : ");
		n1 = sc.nextInt();
		System.out.print("두 번째 숫자 입력 : ");
		n2 = sc.nextInt();
		System.out.print("연산기호 입력 : ");
		str = sc.next();
		System.out.println("결과 : " + cal.getResult(n1, n2, str));
	}
}
