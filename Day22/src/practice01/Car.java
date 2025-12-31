package practice01;

public class Car {
	Obstacle ob = new Obstacle();
	
	void run() {
		System.out.println("주행중...");
	}
	
	void stop() {
		if(ob.obstacle) {
			System.out.println("장애물로 인해 정지");
		} 
	}
	
}
