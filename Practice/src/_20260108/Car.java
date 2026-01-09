package _20260108;

public class Car {
	
	String company = "현대자동차";
	String model, color;
	int maxSpeed;
	
	public Car() {}
	
	public Car(String car) {
		this.model = car;
	}
	
	public Car(String car, String color) {
		this.model = car;
		this.color = color;
	}
	
	public Car(String car, String color, int maxSpeed) {
		this.model = car;
		this.color = color;
		this.maxSpeed = maxSpeed;
	}
	
}
