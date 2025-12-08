package iteration;

import java.util.Scanner;

public class PersonalTest6 {
	public static void main(String[] args) {
		// 1~9까지 구구단
		// 1에서 9 사이의 정수를 입력받는다
		// 입력받은 정수를 num이라 하고
		// 1보다 작거나 9보다 큰 수를 입력한 경우
		// "1 ~ 9 사이의 양수를 하나 입력하세요"
		// 1 ~ 9 사이의 수를 입력했을 경우 구구단 출력
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 입력 : ");
		int num = sc.nextInt();
		
		if ( num >= 1 && num <= 9) {
			for ( int i = 1; i < 10; i++) {
				System.out.printf("%d * %d = %d\n", num, i, num*i);
			}
		} else {
			System.out.println("1 ~ 9 사이의 양수를 하나 입력하세요 : ");
		}
	}
}
