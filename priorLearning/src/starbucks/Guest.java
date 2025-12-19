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
		starbucks.sell(money);
		
	}
	
}
