package iteration;

// 실습문제 1번
// 커피 한 잔당 가격은 3500원이다. 손님이 백만원으로 커피를 주문하는 상황을 
// 반복문으로 출력하시오.
// 예) 커피번호 2 - 누적금액(7000원)

// 2번
// 주문 10잔 당 무료 1잔이 서비스되도록 구현하시오.
// 예) 커피번호 11 - 서비스

public class Test02 {
	public static void main(String[] args) {
		int coffeePrice = 3500;
		int haveMoney = 1000000;
		int totalCoffee = ( haveMoney / coffeePrice ) + ( ( haveMoney / coffeePrice ) / 10 );
		int plusMoney = 0;
		
		for (int i = 1; i <= totalCoffee; i++) {
			if(i > 1 && i % 10 == 1) {
				System.out.printf("커피번호 %d - 서비스\n", i);
			} else {
				plusMoney += coffeePrice;
				System.out.printf("커피번호 %d - 누적금액(%d원)\n", i, plusMoney);
			}
		}	
	}
}
