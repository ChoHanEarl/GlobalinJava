package fruit;

public class FruitTester {
	public static void main(String[] args) {
		// 실습
		// 1. 과일이라는 공통 주제로 상속을 설계하시오.
		Banana banana = new Banana();
		Apple apple = new Apple();
		Peach peach = new Peach();
		
		Fruit fruit = banana;
		if( fruit instanceof Banana ) {
			banana = (Banana)fruit;
			banana.eat();
			banana.price(3000);
		}
		
		fruit = peach;
		if( fruit instanceof Peach ) {
			peach = (Peach)fruit;
			peach.eat();
			peach.price(4000);
		}
		
		fruit = apple;
		if( fruit instanceof Apple ) {
			apple = (Apple)fruit;
			apple.eat();
			apple.price(5000);
		}
	}
}
