package day14;

public class Starbucks {
	
	Coffee coffee = new Coffee();
	Money money;
	Coffee sell(Money money) {
		this.money = money;
		return coffee;
	}
	
	
}
