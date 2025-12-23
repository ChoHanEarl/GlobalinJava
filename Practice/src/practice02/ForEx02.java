package practice02;

import java.util.Scanner;

public class ForEx02 {
	public static void main(String[] args) {
		// 두 수의 최소공배수 구하기
		// 키보드에서 숫자 2개를 입력 받아, 입력받은 두 수의 최소공배수 구하기
		// 예를 들어 2와 5를 입력받았다면 10을, 3과 3을 입력받았다면 3이 출력
		
		Scanner sc = new Scanner(System.in);
		System.out.print("첫 번째 정수 : ");
		int num1 = sc.nextInt();
		System.out.print("두 번째 정수 : ");
		int num2 = sc.nextInt();
		
		int i = 0;
		for(i = 1; i <= num1 * num2; i++) {
			if(i % num1 == 0 && i % num2 == 0) {
				break;
			}
		}
		System.out.println("최소공배수 : " + i);
		
		// 최대공약수 구하기
		// 키보드에서 숫자를 두 개 입력받아, 입력받은 두 수의 최대공약수 구하기
		// 10과 4를 입력받았다면 2가, 3과 7을 입력받았다면 "최대공약수가 없습니다"라는 문자열 출력
		System.out.print("숫자 1 : ");
		int n1 = sc.nextInt();
		System.out.print("숫자 2 : ");
		int n2 = sc.nextInt();
		
		int check = 0;
		
		if(n1 >= n2) {
			check = n2;
		} else {
			check = n1;
		}
		
		int i2;
		for(i2 = check; i2 >= 1; i2--) {
			if((n1 % 1 == 0) && (n2 % 1 == 0)) {
				break;
			}
		}
		
		if(i2 == 1) {
			System.out.println("최대공약수 없음");
		} else {
			System.out.println("최대공약수 : " + i2);
		}
		
		// 키보드에서 숫자를 입력받아, 그 숫자가 소수인지 아닌지 판별해주는 코드
		int num = 0;
		
		System.out.println("숫자를 입력하세요 : ");
		num = sc.nextInt();
		
		int j = 0;
		for(j = 2; j <= num; j++) {
			if (num % j == 0) {
				break;
			}
		}
		if(num == j) {
			System.out.println(num + "은(는) 소수입니다.");
		} else {
			System.out.println(num + "은(는) 소수가 아닙니다.");
		}
		
		// 1부터 20까지의 정수 중 2 또는 3의 배수가 아닌 수의 총합을 구하는 코드
		int sum = 0;
		for(int k = 1; k <= 20; k++) {
			if(k % 2 != 0 && k % 3 != 0) {
				sum += k;
			}
		}
		System.out.println("1~20중 2의 배수, 3의 배수가 아닌 수의 총합 : " + sum);
		
	}
}
