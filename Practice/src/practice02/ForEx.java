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
		
		// 10개의 정수를 입력받아 그 수들 중 짝수가 몇개인지 구하기
		int count = 0;
		for(int i = 1; i <= 10; i++) {
			System.out.print("정수 입력 : ");
			int num3 = sc.nextInt();
			if(num3 % 2 == 0) {
				count++;
			}
		}
		System.out.println("짝수의 갯수 : " + count);
		
		// 정수의 총합 구하기 2
		// Scanner를 통해 정수 n1, n2를 입력받는다.
		// n1부터 n2까지의 합을 계산하여 그 결과를 출력하는 프로그램 작성
		// 예를 들어 2와 5를 입력받으면 2 + 3 + 4 + 5 의 연산결과인 14 출력
		
		System.out.print("첫 번째 정수 입력 : ");
		int n1 = sc.nextInt();
		System.out.print("두 번째 정수 입력 : ");
		int n2 = sc.nextInt();
		
		int temp = 0;
		if(n1 > n2) {
			n1 = temp;
			temp = n2;
			n2 = n1;
		} 
		int sum3 = 0;
		for(int i = n1; i <= n2; i++) {
			sum3 += i;
		}
		System.out.printf("%d부터 %d까지의 합 : %d\n", n1, n2, sum3);
		
	}
}
