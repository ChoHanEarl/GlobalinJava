// 실습 문제
// 1. 커피 한 잔당 가격은 4500원이다.
// 손님은 돈을 1000000원 가지고 있다.
// 몇 잔을 살 수 있고 잔돈은 얼마일까?

package operator;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		System.out.print("커피의 가격 : ");
		int coffee = s.nextInt();
		
		System.out.print("손님이 가지고 있는 금액 : ");
		int money = s.nextInt();
		
		// 살 수 있는 커피의 갯수
		int coffeeNumber = money / coffee;
		
		// 잔돈
		int change = money % coffee;
		
		if(coffee > money) {
			System.out.println("잔액이 부족합니다.");
		}
		
		if(coffee <= money) {
			System.out.printf("살 수 있는 커피의 갯수 : %d\n", coffeeNumber);
			System.out.printf("잔돈 : %d\n", change);
		}
		
	}
}
