package day14;

public class Guest {
	
//	Money money = new Money();
//	Coffee coffee;
	
	void go(Starbucks starbucks) {
		buy(starbucks);
	}
	
	void buy(Starbucks starbucks) {
		Coffee coffee = starbucks.sell(new Money());
//		Money money = null;
	}
	
}
