package practice02;

import java.util.Scanner;

public class ForEx {
	public static void main(String[] args) {
		// 1부터 10까지 출력하는 for문
		for(int i = 1; i <= 10; i++) {
			System.out.print(i + " ");
		}
		
		System.out.println();
		
		// 10부터 1까지 출력하는 for문
		for(int i = 10; i >= 1; i--) {
			System.out.print(i + " ");
		}
		
		System.out.println();
		
		// 1부터 10까지 3의 배수만 출력하는 for문
		for(int i = 1; i <= 10; i++) {
			if(i % 3 == 0) {
				System.out.print(i + " ");
			}
		}
		
		System.out.println();
		
		// 1부터 20까지 홀수 출력
		for(int i = 1; i <= 20; i++) {
			if(i % 2 == 1) {
				System.out.print(i + " ");
			}
		}
		
		System.out.println();
		
		// 1부터 10까지 총 합 구하기
		int sum = 0;
		for(int i = 1; i <= 10; i++) {
			sum += i;
		}
		System.out.println("1부터 10까지 합 : " + sum);
		
		// 정수형 변수를 하나 초기화 하고 해당 정수에 해당하는 구구단 출력
		int num = 2;
		for(int i = 1; i <= 9; i++) {
			System.out.printf("%d * %d = %d\n", num, i, num*i);
		}
		
		System.out.println();
		
		// 정수의 총합 구하기
		// Scanner를 통해 정수를 입력받는다
		// 그리고 1부터 입력받은 정수 n까지의 합을 계산하여 그 결과를 출력하는 프로그램 작성
		// 예를들어 정수 5를 입력받으면, 1+2+3+4+5의 연산결과인 15를 출력
		
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력 : ");
		int num2 = sc.nextInt();
		int sum2 = 0;
		for(int i = 1; i <= num2; i++ ) {
			sum2 += i;
		}
		System.out.println("총합 : " + sum2);
		
	}
}
