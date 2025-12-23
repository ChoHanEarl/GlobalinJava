package fruit;

public class Fruit {

	void eat() {
		System.out.println("Fruit");
	}
	
	int price;
	void total(int price) {
		this.price = price;
		System.out.printf("총액 : %d\n", this.price);
	}
}
