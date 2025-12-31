package practice01;

public class CarMain {
	public static void main(String[] args) {
		Car car = new Car();
		Obstacle ob = new Obstacle();
		if(ob.obstacle == false) {
			car.run();			
		} else {
			car.stop();
		}
	}
}
