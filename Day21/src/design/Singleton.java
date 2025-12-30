package design;

public class Singleton { // 인스턴스가 하나만 존재해야 한다.
	
	private static Singleton INSTANCE = new Singleton();
	private Singleton() {}
	
	public static Singleton getInstance() {
		return INSTANCE;
	}
	
	public void a() {
		Singleton.getInstance();
	}
}
