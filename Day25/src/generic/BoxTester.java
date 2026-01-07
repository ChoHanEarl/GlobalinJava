package generic;

public class BoxTester {
	public static void main(String[] args) {
		
		Box<Fruit> box = new Box<Fruit>();
		box.setT(new Apple());
//		Tiger tiger = box3.getT(); // 에러 발생
		// box.setT(new Tiger()); // 에러 발생
//		Box<Tiger> box2 = new Box<Tiger>();
//		box2.setT(new Tiger());
//		Apple apple = box2.getT(); // 에러 발생
		// box2.setT(new Apple()); // 에러 발생
		
//		Box box = new Box();
//		box.setApple(new Apple());
//		Apple apple1 = box.getApple();
//		
//		Box box2 = new Box();
//		box2.setObject(new Apple());
//		Apple apple2 = (Apple)box2.getObject();
		// 말이 안 되는데 에러는 안 뜸. 예외만 발생(위험)
		// (ClassCastException)
//		Tiger tiger = (Tiger)box2.getObject();
	}
}
