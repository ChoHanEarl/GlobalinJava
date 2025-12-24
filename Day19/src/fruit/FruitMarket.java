package fruit;

import fruit.extend.Apple;

public class FruitMarket {
	
	// Fruit 메소드에서 Apple을 반환, 그러나 과일을 판다고 얘기함.
	// 다형성의 예시. 다형성을 잘 활용하면 프로그램이 유연해진다.
	Fruit sell(String name) {
		if ("Apple".equals(name)) {
			return new Apple();
		}
		return null;
	}
	
	Fruit[] fruits;
	void buy(Fruit fruit) {
		fruits[0] = fruit;
	}
}
