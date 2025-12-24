package fruit.extend;

import fruit.Fruit;
import fruit.Nutrition;

public class Apple extends Fruit {
	
	public Apple(){		
//		int a = 10; => 에러
		super("green");
//		int a = 10; // 에러 x
//		super.color = "green";
	}
	
	void apple() {
			
	}
	
	public Nutrition getNutrition() {
		return new Nutrition();
	}
	
}
