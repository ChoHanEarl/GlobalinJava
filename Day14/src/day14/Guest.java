package day14;

public class Guest {
	
	Money money = new Money();
	Coffee coffee;
	void buy(Starbucks starbucks) {
		coffee = starbucks.sell(money);
		money = null;
	}
	
}
