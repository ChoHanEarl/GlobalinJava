package practice;

public class CoffeeShop {

	int MAX_CUP;
	final int PRICE_PER_CUP = 3500;
	int totalSellMoney = 0;
	
	// 일일 최대 커피 판매 수량
	CoffeeShop(int MAX_CUP) {
		this.MAX_CUP = MAX_CUP;
	}
	
	// 주문 시 수량 차감
	void order() throws InterruptedException {
//		for(int i = 1; i <= 200; i++) {
//			if( MAX_CUP > 0 ) {
//				--MAX_CUP;
//			} else {
//				System.out.println("재고가 없습니다.");
//				break;
//			}
//		}
		while(true) {
			if(MAX_CUP <= 0) {
				System.out.println("재고가 없습니다.");
				return; // 메소드 강제종료 (반복문 강제종료는 break)
			}
			
			System.out.printf("Ordered..%d\n", MAX_CUP);
			Thread.sleep(1000);
			
			if(MAX_CUP % 10 == 0) {
				System.out.println("무료 한 잔 제공");
			} else {
				totalSellMoney += PRICE_PER_CUP;
			}
			--MAX_CUP;	
		}
	}
	
	// 다 팔린 후 남은 커피 수량
	void showMaxCup() {
		System.out.println("남은 커피 : " + MAX_CUP);
	}
	
	// 총 매출
	void totalSellMoney() {
		System.out.println("오늘의 매출 : " + totalSellMoney);
	}
	
}
