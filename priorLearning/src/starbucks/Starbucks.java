package starbucks;

public class Starbucks {
	
	Money money;
	
	Starbucks() {
		money = new Money(0);
	}
	
	Coffee sell(Money guestMoney) {
		if(Constants.ONE_CUP_PRICE >= money.won) {
			System.out.println("잔액이 부족합니다.");
			return null;
		}
		
		money.won += Constants.ONE_CUP_PRICE;
		guestMoney.won -= Constants.ONE_CUP_PRICE;
		
		return new Coffee();
	}
	
}
