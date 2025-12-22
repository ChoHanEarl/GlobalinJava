package starbucks;

public class Guest {

	Coffee[] coffeeArray;
	Money money;
	int buyCount;
	
	Guest(Money money, int size) {
		this.money = money;
		coffeeArray = new Coffee[size];
	}
	
	void buy(Starbucks starbucks) {
		if (buyCount >= coffeeArray.length) {
			System.out.println("초과 구매");
			return;
		}
		coffeeArray[buyCount] = starbucks.sell(money);
		buyCount++;
	}
	
}
