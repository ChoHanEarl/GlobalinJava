package fruit;

import fruit.extend.Apple;

public class FruitTester {
	public static void main(String[] args) {
		Fruit fruit = new Apple(); // polymophism 다형성
		
		if ( fruit instanceof Apple ) {
			// 부모 클래스에서 자식 클래스, 즉 상위에서 하위로 갈 때는 강제형변환 해줘야함
			// 기본자료형 형변환 원리와 동일(범위가 큰 자료형에서 작은 자료형으로 갈 때는 강제형변환)
			// 이런 경우에는 instanceof를 통해 검사를 한 후 진행하는 것이 좋다.
			Apple apple = (Apple) fruit; 			
		}
		
	}
}
